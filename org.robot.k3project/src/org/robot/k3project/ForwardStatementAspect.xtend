package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.ForwardStatement
import org.robot.model.robot.Scenario
import org.robot.vrep.robot.PolyRob

@Aspect(className=ForwardStatement)
class ForwardStatementAspect extends ControlStatementAspect {
	def Scenario exec() {
		println("forward")
		PolyRob.singleton.goStraight(10, 5000);
		return null
	}
}
