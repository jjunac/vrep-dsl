package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.BallAheadCondition

@Aspect(className=BallAheadCondition)
class BallAheadConditionAspect extends ConditionAspect {
	def boolean eval() {
		return false
	}
}
