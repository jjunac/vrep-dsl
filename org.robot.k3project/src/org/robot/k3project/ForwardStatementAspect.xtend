package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.vrep.robot.PolyRob
import org.robot.model.robot.ForwardStatement

@Aspect(className=ForwardStatement)
class ForwardStatementAspect extends ControlStatementAspect {
	
	def String getType() {
		return "forward"
	}
	
	def Scenario doStep() {
		println("forward")
		PolyRob.singleton.goStraight(10, _self.step * _self.factor);
		return null
	}
	
}
