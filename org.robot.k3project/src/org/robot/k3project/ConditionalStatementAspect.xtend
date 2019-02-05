package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.model.robot.ControlStatement

@Aspect(className=ControlStatement)
abstract class ConditionalStatementAspect extends StatementAspect {
	def Scenario exec();
}
