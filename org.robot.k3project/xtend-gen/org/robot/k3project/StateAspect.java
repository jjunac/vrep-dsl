package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.robot.k3project.StateAspectStateAspectProperties;
import org.robot.model.robot.Action;
import org.robot.model.robot.State;

@Aspect(className = State.class)
@SuppressWarnings("all")
public class StateAspect {
  @Step
  public static void exec(final State _self) {
    final org.robot.k3project.StateAspectStateAspectProperties _self_ = org.robot.k3project.StateAspectStateAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exec()
    if (_self instanceof org.robot.model.robot.State){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			org.robot.k3project.StateAspect._privk3_exec(_self_, (org.robot.model.robot.State)_self);
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "State", "exec");
    	} else {
    		command.execute();
    	}
    	;
    };
  }
  
  protected static void _privk3_exec(final StateAspectStateAspectProperties _self_, final State _self) {
    InputOutput.<EList<Action>>println(_self.getActions());
  }
}
