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
  public static void enter(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    	// BeginInjectInto org.robot.k3project.StatementAspect#void enter() from org.robot.k3project.ConditionalStatementAspect
    		if (_self instanceof org.robot.model.robot.ConditionalStatement){
    			org.robot.k3project.ConditionalStatementAspect.enter((org.robot.model.robot.ConditionalStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#void enter() from org.robot.k3project.ConditionalStatementAspect
    // #DispatchPointCut_before# void enter()
    if (_self instanceof org.robot.model.robot.Statement){
    	org.robot.k3project.StatementAspect._privk3_enter(_self_, (org.robot.model.robot.Statement)_self);
    };
  }
  
  @Step
  public static Scenario step(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
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
  
  public static Scenario stepWithoutDebug(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario stepWithoutDebug()
    if (_self instanceof org.robot.model.robot.Statement){
    	result = org.robot.k3project.StatementAspect._privk3_stepWithoutDebug(_self_, (org.robot.model.robot.Statement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  @Abstract
  public static Scenario doStep(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ConditionalStatementAspect
    		if (_self instanceof org.robot.model.robot.ConditionalStatement){
    			result = org.robot.k3project.ConditionalStatementAspect.doStep((org.robot.model.robot.ConditionalStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ConditionalStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ControlStatementAspect
    		if (_self instanceof org.robot.model.robot.ControlStatement){
    			result = org.robot.k3project.ControlStatementAspect.doStep((org.robot.model.robot.ControlStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ControlStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ExecuteStatementAspect
    		if (_self instanceof org.robot.model.robot.ExecuteStatement){
    			result = org.robot.k3project.ExecuteStatementAspect.doStep((org.robot.model.robot.ExecuteStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ExecuteStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ForwardStatementAspect
    		if (_self instanceof org.robot.model.robot.ForwardStatement){
    			result = org.robot.k3project.ForwardStatementAspect.doStep((org.robot.model.robot.ForwardStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.ForwardStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.PrintStatementAspect
    		if (_self instanceof org.robot.model.robot.PrintStatement){
    			result = org.robot.k3project.PrintStatementAspect.doStep((org.robot.model.robot.PrintStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.PrintStatementAspect
    	// BeginInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.RightStatementAspect
    		if (_self instanceof org.robot.model.robot.RightStatement){
    			result = org.robot.k3project.RightStatementAspect.doStep((org.robot.model.robot.RightStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#Scenario doStep() from org.robot.k3project.RightStatementAspect
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.Statement){
    	result = org.robot.k3project.StatementAspect._privk3_doStep(_self_, (org.robot.model.robot.Statement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static boolean isFinished(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.StatementAspect#boolean isFinished() from org.robot.k3project.ConditionalStatementAspect
    		if (_self instanceof org.robot.model.robot.ConditionalStatement){
    			result = org.robot.k3project.ConditionalStatementAspect.isFinished((org.robot.model.robot.ConditionalStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#boolean isFinished() from org.robot.k3project.ConditionalStatementAspect
    // #DispatchPointCut_before# boolean isFinished()
    if (_self instanceof org.robot.model.robot.Statement){
    	result = org.robot.k3project.StatementAspect._privk3_isFinished(_self_, (org.robot.model.robot.Statement)_self);
    };
    return (boolean)result;
  }
  
  public static void exit(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    	// BeginInjectInto org.robot.k3project.StatementAspect#void exit() from org.robot.k3project.ConditionalStatementAspect
    		if (_self instanceof org.robot.model.robot.ConditionalStatement){
    			org.robot.k3project.ConditionalStatementAspect.exit((org.robot.model.robot.ConditionalStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.StatementAspect#void exit() from org.robot.k3project.ConditionalStatementAspect
    // #DispatchPointCut_before# void exit()
    if (_self instanceof org.robot.model.robot.Statement){
    	org.robot.k3project.StatementAspect._privk3_exit(_self_, (org.robot.model.robot.Statement)_self);
    };
  }
  
  protected static boolean firstStep(final Statement _self) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean firstStep()
    if (_self instanceof org.robot.model.robot.Statement){
    	result = org.robot.k3project.StatementAspect._privk3_firstStep(_self_, (org.robot.model.robot.Statement)_self);
    };
    return (boolean)result;
  }
  
  protected static void firstStep(final Statement _self, final boolean firstStep) {
    final org.robot.k3project.StatementAspectStatementAspectProperties _self_ = org.robot.k3project.StatementAspectStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void firstStep(boolean)
    if (_self instanceof org.robot.model.robot.Statement){
    	org.robot.k3project.StatementAspect._privk3_firstStep(_self_, (org.robot.model.robot.Statement)_self,firstStep);
    };
  }
  
  protected static void _privk3_enter(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    _self_.firstStep = true;
  }
  
  protected static Scenario _privk3_step(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    return StatementAspect.stepWithoutDebug(_self);
  }
  
  protected static Scenario _privk3_stepWithoutDebug(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    final Scenario res = StatementAspect.doStep(_self);
    _self_.firstStep = false;
    return res;
  }
  
  protected static Scenario _privk3_doStep(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static boolean _privk3_isFinished(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    return (!_self_.firstStep);
  }
  
  protected static void _privk3_exit(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
  }
  
  protected static boolean _privk3_firstStep(final StatementAspectStatementAspectProperties _self_, final Statement _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("isFirstStep") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (boolean) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.firstStep;
  }
  
  protected static void _privk3_firstStep(final StatementAspectStatementAspectProperties _self_, final Statement _self, final boolean firstStep) {
    boolean setterCalled = false;
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("setFirstStep")
    				&& m.getParameterTypes().length == 1) {
    			m.invoke(_self, firstStep);
    			setterCalled = true;
    		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    if (!setterCalled) {
    	_self_.firstStep = firstStep;
    }
  }
}
