package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Robot
import fr.inria.diverse.k3.al.annotationprocessor.Main

import static extension org.robot.k3project.ScenarioAspect.*
import static extension org.robot.k3project.ConnectionAspect.*
import static extension org.robot.k3project.StatementBlockAspect.*
import org.robot.model.robot.Scenario
import org.robot.vrep.robot.PolyRob
import org.robot.model.robot.Statement
import org.eclipse.emf.common.command.CompoundCommand
import org.eclipse.emf.common.command.Command

@Aspect(className=Robot)
class RobotAspect {
	
	public var Scenario sc = null
	public static Robot instance = null
	
	
	@Main
	def void exec() {
		RobotAspect.instance = _self
		_self.connection.connect
		
		_self_.sc = _self.initial
		
		while(_self_.sc !== null) {
			_self_.sc.enter()
			var Scenario next = null
			while(!_self_.sc.isFinished() && next === null) {
				PolyRob.singleton.readNoseSensor()
				println(String.format("Robot is at (%d, %d), object ahead at: %d", PolyRob.singleton.position.x, PolyRob.singleton.position.y, PolyRob.singleton.detectedObjectDistance))
				val shortcut =_self.global.exec()
				if (shortcut === null || shortcut.name === _self_.sc.name) {
					next = _self_.sc.step()
				} else {
					next = shortcut
				}
			}
			_self_.sc.exit()
			_self_.sc = next
		}
		
		if (PolyRob.getSingleton() !== null)
			PolyRob.getSingleton().stopSimulation()
	}
	
	def Statement getCurrentStatement() {
		if (_self_.sc === null)
			return null
		return _self_.sc.getCurrentStatement()
	}
	
	def String getFullName() {
		return _self.name
	}
}
