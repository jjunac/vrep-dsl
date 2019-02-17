package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension org.robot.k3project.ConditionAspect.*
import org.robot.model.robot.IfStatement

@Aspect(className=IfStatement)
class IfStatementAspect extends ConditionalStatementAspect {
	
	def String getType() {
		return "if"
	}
	
	def boolean shouldSkipBlock() {
		println(_self.condition.eval())
		println(_self.firstStep)
		return !_self.condition.eval() || !_self.firstStep
	}
	
}
