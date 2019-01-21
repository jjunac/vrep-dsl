package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Action
import org.robot.model.robot.Robot
import fr.inria.diverse.k3.al.annotationprocessor.Main
import org.robot.model.robot.State
import fr.inria.diverse.k3.al.annotationprocessor.Step

import static extension org.robot.k3project.StateAspect.*

@Aspect(className=Robot)
class RobotASpect{
	
	@Main
	def void exec(){
		for(s:_self.scenario.states){
			s.exec()
		}
		
	}
}



@Aspect(className=State)
class StateAspect {
	
	@Step
	def void exec(){
		println(_self.actions)
	}
	
	
	
}