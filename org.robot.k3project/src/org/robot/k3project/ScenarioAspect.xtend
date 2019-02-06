package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario

import static extension org.robot.k3project.StatementAspect.*

@Aspect(className=Scenario)
class ScenarioAspect {
	def Scenario exec() {
		var Scenario next = null
		var iter = _self.statements.iterator
		
		while (next === null && iter.hasNext) {
			next = iter.next.exec()
		}
		
		return next
	}
}