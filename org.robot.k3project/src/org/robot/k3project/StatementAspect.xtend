package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Statement
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.robot.model.robot.Scenario

@Aspect(className=Statement)
abstract class StatementAspect {
	
	protected boolean firstStep = true
	public boolean isActive = false
	
	def String getType();
	
	def void enter() {
		_self_.firstStep = true
		_self_.isActive = true
	}

	@Step
	def Scenario step() {
		return _self.stepWithoutDebug()		
	}
	
	def Scenario stepWithoutDebug() {
		val res = _self.doStep()
		_self_.firstStep = false
		return res	
	}
	
	def Scenario doStep();
	
	def boolean isFinished() {
		return !_self_.firstStep
	}
	
	def void exit() {
		_self_.isActive = false
	}
	
	def Statement getCurrentStatement() {
		return _self
	}
	
	def boolean getIsActive() {
		return _self_.isActive
	}
	
}
