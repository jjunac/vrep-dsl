package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario

import static extension org.robot.k3project.StatementBlockAspect.*
import org.robot.model.robot.Statement
import org.robot.model.robot.Robot

@Aspect(className=Scenario)
class ScenarioAspect {
	
	def void enter() {
		_self.statementBlock.enter()
	}
	
	def Scenario step() {
		return _self.statementBlock.step()
	}
	
	def void exit() {
		_self.statementBlock.exit()
	}
	
	def boolean isFinished() {
		_self.statementBlock.isFinished()
	}
	
	def Statement getCurrentStatement() {
		return _self.statementBlock.getCurrentStatement()
	}
	
	def String getFullName() {
		return RobotAspect.getFullName(_self.eContainer as Robot) + _self.name
	}
}
