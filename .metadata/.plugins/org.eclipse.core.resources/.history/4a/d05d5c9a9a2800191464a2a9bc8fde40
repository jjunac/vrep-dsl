package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.model.robot.ExecuteStatement

@Aspect(className=ExecuteStatement)
class ExecuteStatementAspect extends StatementAspect {
	def Scenario exec() {
		return _self.destination
	}
}
