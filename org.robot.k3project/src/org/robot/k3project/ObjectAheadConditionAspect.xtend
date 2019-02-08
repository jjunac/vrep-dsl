package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.ObjectAheadCondition

@Aspect(className=ObjectAheadCondition)
class ObjectAheadConditionAspect extends ConditionAspect {
	def boolean eval() {
		return false
	}
}
