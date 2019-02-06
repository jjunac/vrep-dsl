package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.model.robot.PrintStatement

@Aspect(className=PrintStatement)
class PrintStatementAspect extends StatementAspect {
	def Scenario exec() {
		println(_self.text)
		return null
	}
}