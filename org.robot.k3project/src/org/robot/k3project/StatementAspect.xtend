package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Statement
import fr.inria.diverse.k3.al.annotationprocessor.Step
import org.robot.model.robot.Scenario

@Aspect(className=Statement)
abstract class StatementAspect {
	@Step
	def Scenario exec();
}
