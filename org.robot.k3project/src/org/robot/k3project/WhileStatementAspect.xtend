package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect

import static extension org.robot.k3project.ConditionAspect.*
import org.robot.model.robot.WhileStatement

@Aspect(className=WhileStatement)
class WhileStatementAspect extends ConditionalStatementAspect {
	
	def boolean shouldSkipBlock() {
		return !_self.condition.eval()
	}
	
}
