package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.TrueCondition

@Aspect(className=TrueCondition)
class TrueConditionAspect extends ConditionAspect {
	def boolean eval() {
		return true;
	}
}
