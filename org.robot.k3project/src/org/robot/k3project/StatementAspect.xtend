package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Statement
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.robot.model.robot.Scenario

@Aspect(className=Statement)
abstract class StatementAspect {
	
	boolean firstStep = true
	
	def void enter() {
		_self_.firstStep = true
	}

	@Step
	def Scenario step() {
		return _self.stepWithoutDebug()		
	}
	
	def Scenario stepWithoutDebug() {
		_self_.firstStep = false
		return _self.doStep()		
	}
	
	def Scenario doStep();
	
	def boolean isFinished() {
		return !_self_.firstStep
	}
	
	def void exit() {}
}
