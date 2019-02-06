package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Connection
import org.robot.vrep.robot.PolyRob

@Aspect(className=Connection)
class ConnectionAspect {
	def void connect() {
		PolyRob.createSingleton(_self.ip, _self.port);
	}
}
