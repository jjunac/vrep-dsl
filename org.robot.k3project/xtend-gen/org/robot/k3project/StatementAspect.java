package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import fr.inria.diverse.k3.al.annotationprocessor.Step;
import org.robot.k3project.StatementAspectStatementAspectProperties;
import org.robot.model.robot.Scenario;
import org.robot.model.robot.Statement;

@Aspect(className = Statement.class)
@SuppressWarnings("all")
public abstract class StatementAspect {
  @Step
  @Abstract
  public static Scenario step(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ConditionalStatementAspect
    		if (_self instanceof org.robot.model.robot.ConditionalStatement){
    			result = org.robot.k3project.ConditionalStatementAspect.step((org.robot.model.robot.ConditionalStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ConditionalStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ControlStatementAspect
    		if (_self instanceof org.robot.model.robot.ControlStatement){
    			result = org.robot.k3project.ControlStatementAspect.step((org.robot.model.robot.ControlStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ControlStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ExecuteStatementAspect
    		if (_self instanceof org.robot.model.robot.ExecuteStatement){
    			result = org.robot.k3project.ExecuteStatementAspect.step((org.robot.model.robot.ExecuteStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ExecuteStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ForwardStatementAspect
    		if (_self instanceof org.robot.model.robot.ForwardStatement){
    			result = org.robot.k3project.ForwardStatementAspect.step((org.robot.model.robot.ForwardStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.ForwardStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.PrintStatementAspect
    		if (_self instanceof org.robot.model.robot.PrintStatement){
    			result = org.robot.k3project.PrintStatementAspect.step((org.robot.model.robot.PrintStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario step() from org.robot.k3project.PrintStatementAspect
    // #DispatchPointCut_before# Scenario step()
    if (_self instanceof org.robot.model.robot.Statement){
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand command = new fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepCommand() {
    		@Override
    		public void execute() {
    			addToResult(org.robot.k3project.StatementAspect._privk3_step(_self_, (org.robot.model.robot.Statement)_self));
    		}
    	};
    	fr.inria.diverse.k3.al.annotationprocessor.stepmanager.IStepManager stepManager = fr.inria.diverse.k3.al.annotationprocessor.stepmanager.StepManagerRegistry.getInstance().findStepManager(_self);
    	if (stepManager != null) {
    		stepManager.executeStep(_self, new Object[] {_self}, command, "Statement", "step");
    	} else {
    		command.execute();
    	}
    	result = command.getResult();
    	;
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static Scenario exec(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario exec() from org.robot.k3project.ConditionalStatementAspect
    		if (_self instanceof org.robot.model.robot.ConditionalStatement){
    			result = org.robot.k3project.ConditionalStatementAspect.exec((org.robot.model.robot.ConditionalStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario exec() from org.robot.k3project.ConditionalStatementAspect
    // #DispatchPointCut_before# Scenario exec()
    if (_self instanceof org.robot.model.robot.Statement){
    	result = org.robot.k3project.StatementAspect._privk3_exec(_self_, (org.robot.model.robot.Statement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static Scenario _privk3_step(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static Scenario _privk3_exec(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    return StatementAspect.step(_self);
  }
}
