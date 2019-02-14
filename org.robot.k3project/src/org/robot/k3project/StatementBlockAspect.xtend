package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario

import static extension org.robot.k3project.StatementAspect.*
import java.util.Iterator
import org.robot.model.robot.Statement
import org.robot.model.robot.StatementBlock

@Aspect(className=StatementBlock)
class StatementBlockAspect {
	
	Iterator<Statement> itStatement
	Statement current
	Scenario next
	
	def void enter() {
		_self_.itStatement = _self.statements.iterator()
		if(_self_.itStatement.hasNext()) {
			_self_.current = _self_.itStatement.next()
			_self_.current.enter()
		} else {
			_self_.current = null
		}
		_self_.next = null
	}
	
	def boolean isFinished() {
		return _self_.current === null 
				|| (_self_.current.isFinished() && !_self_.itStatement.hasNext())
				|| _self_.next !== null
	}
	
	def Scenario step() {
		return _self.step(true)
	}
	
	def Scenario stepWithoutDebug() {
		return _self.step(false)
	}
	
	private def Scenario step(boolean debug) {
		_self_.next = null
		if (debug)
			_self_.next = _self_.current.step()
		else
			_self_.next = _self_.current.stepWithoutDebug()
		_self_.current.exit()
		if (_self_.current.isFinished() && _self_.itStatement.hasNext()) {
			_self_.current = _self_.itStatement.next()
			_self_.current.enter()
		}
		return _self_.next
	}
	
	def void exit() {}
	

	
	def Scenario exec() {
		_self.enter()
		while(!_self.isFinished()) {
			_self.stepWithoutDebug()
		}
		_self.exit()
		return _self_.next
	}
	
}
