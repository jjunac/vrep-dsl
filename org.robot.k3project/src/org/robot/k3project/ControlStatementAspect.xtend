package org.robot.k3project

import fr.inria.diverse.k3.al.annotationprocessor.Aspect
import org.robot.model.robot.Scenario
import org.robot.model.robot.ControlStatement

@Aspect(className=ControlStatement)
abstract class ControlStatementAspect extends StatementAspect {
	
	protected final int step = 200 
	
	def Scenario doStep();
	
	def int getFactor() {
		if(_self.value == 0)
			return 1
		return _self.value
	}
}
