package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.model.robot.ExecuteStatement

@Aspect(className=ExecuteStatement)
class ExecuteStatementAspect extends StatementAspect {
	
	def String getType() {
		return "execute"
	}
	
	def Scenario doStep() {
		println("goto " + _self.destination.name)
		return _self.destination
	}
}
