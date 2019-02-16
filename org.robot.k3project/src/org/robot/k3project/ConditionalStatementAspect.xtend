package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.ConditionalStatement

import static extension org.robot.k3project.StatementBlockAspect.*
import org.robot.model.robot.Scenario

@Aspect(className=ConditionalStatement)
abstract class ConditionalStatementAspect extends StatementAspect {
	
	def void enter() {
//		StatementAspect.enter(_self)
		_self.firstStep = true
		println("on entry condition")
		_self.statementBlock.enter()
	}
	
	def Scenario doStep() {
		if (!_self.shouldSkipBlock())
			return _self.statementBlock.step()
		return null
	}
	
	def void exit() {
//		StatementAspect.exit(_self)
		_self.statementBlock.exit()
	}
	
	def boolean shouldSkipBlock();
	
	def boolean isFinished() {
		return _self.shouldSkipBlock()
	}
	
}
