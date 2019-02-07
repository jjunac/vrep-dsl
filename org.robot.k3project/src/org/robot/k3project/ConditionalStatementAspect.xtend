package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import java.util.Iterator
import org.robot.model.robot.Statement
import org.robot.model.robot.ConditionalStatement

@Aspect(className=ConditionalStatement)
abstract class ConditionalStatementAspect extends StatementAspect {
	
	Iterator<Statement> itStatement
	public Scenario next = null
	
	def boolean mustExecute();
	
	def void start() {
		_self_.itStatement = _self.statements.iterator()
	}
	
	def Scenario step() {
		if (_self_.itStatement === null || !_self_.itStatement.hasNext())
			_self.start()
		_self_.next = _self_.itStatement.next.step()
		return _self_.next
	}
	
	def Scenario exec() {
		_self.start
		while(_self.mustExecute() && _self.next !== null) {
			_self.step()
		}
		return _self.next
	}
	
}
