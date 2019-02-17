package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.vrep.robot.PolyRob
import org.robot.model.robot.RightStatement

@Aspect(className=RightStatement)
class RightStatementAspect extends ControlStatementAspect {
	
	def String getType() {
		return "right"
	}
	
	def Scenario doStep() {
		println("right")
		PolyRob.singleton.turnRight(1, _self.step);
		return null
	}
	
}
