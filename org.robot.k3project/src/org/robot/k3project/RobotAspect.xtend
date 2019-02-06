package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Robot
import fr.inria.diverse.k3.al.annotationprocessor.Main

import static extension org.robot.k3project.ScenarioAspect.*
import static extension org.robot.k3project.ConnectionAspect.*
import org.robot.model.robot.Scenario
import org.robot.vrep.robot.PolyRob

@Aspect(className=Robot)
class RobotAspect {
	@Main
	def void exec() {
		_self.connection.connect
		_self.global.exec
		var Scenario next = _self.initial.exec
		while (next !== null)
			next = next.exec
		PolyRob.getSingleton().stopSimulation()
	}
}