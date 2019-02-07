package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.model.robot.UntilStatement

import static extension org.robot.k3project.ConditionAspect.*

@Aspect(className=UntilStatement)
class UntilStatementAspect extends ConditionalStatementAspect {
	def Scenario exec() {
		while (!_self.condition.exec) {
			_self.statements.forEach[exec]
			Thread.sleep(1000);
		}
		return null
	}
}
