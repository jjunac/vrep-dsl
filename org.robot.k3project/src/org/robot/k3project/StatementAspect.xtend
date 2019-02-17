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
		println("state in")
		_self_.firstStep = true
		_self_.isActive = true
		println("state" + _self_.isActive)
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
		println("state out")
		_self_.isActive = false
		println("state" + _self_.isActive)
	}
	
	def Statement getCurrentStatement() {
//		return new Random().nextBoolean();
		return _self
	}
	
	def boolean getIsActive() {
		println("state" + _self_.isActive)
		return _self_.isActive
	}
	
}
