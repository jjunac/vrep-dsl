package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario

import static extension org.robot.k3project.StatementAspect.*
import java.util.Iterator
import org.robot.model.robot.Statement

@Aspect(className=Scenario)
class ScenarioAspect {
	
	Iterator<Statement> itStatement
	public Scenario next = null
	
	def void start() {
		_self_.itStatement = _self.statements.iterator()
	}
	
	def void step() {
		_self_.next = _self_.itStatement.next.step()
	}
	
	def boolean isFinished() {
		return !_self_.itStatement.hasNext || _self_.next !== null
	}
	
	def Scenario exec() {
		_self.start
		while(!_self.isFinished()) {
			_self.step()
		}
		return _self.next
	}
}
