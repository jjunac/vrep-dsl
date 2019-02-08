package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Robot
import fr.inria.diverse.k3.al.annotationprocessor.Main

import static extension org.robot.k3project.ScenarioAspect.*
import static extension org.robot.k3project.ConnectionAspect.*
import static extension org.robot.k3project.StatementBlockAspect.*
import org.robot.model.robot.Scenario
import org.robot.vrep.robot.PolyRob

@Aspect(className=Robot)
class RobotAspect {
	@Main
	def void exec() {
		_self.connection.connect
		
		var Scenario sc = _self.initial
		
		while(sc !== null) {
			sc.enter()
			var Scenario next = null
			//println(sc.isFinished())
			while(!sc.isFinished()) {
				_self.global.exec()
				// TODO do something with shortcircuit
				next = sc.step()
				Thread.sleep(1000)				
			}
			sc.exit()
			sc = next
		}
		
		if (PolyRob.getSingleton() !== null)
			PolyRob.getSingleton().stopSimulation()
	}
}
