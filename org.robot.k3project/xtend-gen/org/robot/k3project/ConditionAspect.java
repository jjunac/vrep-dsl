package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.robot.k3project.ConditionAspectConditionAspectProperties;
import org.robot.model.robot.Condition;

@Aspect(className = Condition.class)
@SuppressWarnings("all")
public abstract class ConditionAspect {
  @Step
  @Abstract
  public static boolean eval(final Condition _self) {
    final org.robot.k3project.ConditionAspectConditionAspectProperties _self_ = org.robot.k3project.ConditionAspectConditionAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.ConditionAspect#boolean eval() from org.robot.k3project.BallAheadConditionAspect
    		if (_self instanceof org.robot.model.robot.BallAheadCondition){
    			result = org.robot.k3project.BallAheadConditionAspect.eval((org.robot.model.robot.BallAheadCondition)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ConditionAspect#boolean eval() from org.robot.k3project.BallAheadConditionAspect
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof org.robot.model.robot.Condition){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.robot.k3project.ConditionAspect._privk3_eval(_self_, (org.robot.model.robot.Condition)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Condition", "eval");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final ConditionAspectConditionAspectProperties _self_, final Condition _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
}
