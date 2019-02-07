package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.UntilStatement

import static extension org.robot.k3project.ConditionAspect.*

@Aspect(className=UntilStatement)
class UntilStatementAspect extends ConditionalStatementAspect {
	
	def boolean mustExecute() {
		return !_self.condition.eval()
	}	
	
}
