package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension org.robot.k3project.ConditionAspect.*
import org.robot.model.robot.IfStatement

@Aspect(className=IfStatement)
class IfStatementAspect extends ConditionalStatementAspect {
	
	def boolean shouldSkipBlock() {
		return !_self.condition.eval() || !_self.firstStep
	}
	
}
