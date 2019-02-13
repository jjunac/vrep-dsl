package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.ObjectAheadCondition
import org.robot.vrep.robot.PolyRob

@Aspect(className=ObjectAheadCondition)
class ObjectAheadConditionAspect extends ConditionAspect {
	def boolean eval() {
		return PolyRob.singleton.hasDetectedAnObject()
		//return PolyRob.singleton.getDetectedObjectDistance() < 1
		//return false
	}
}
