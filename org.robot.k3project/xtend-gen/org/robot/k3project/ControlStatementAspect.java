package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ControlStatementAspectControlStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.ControlStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = ControlStatement.class)
@SuppressWarnings("all")
public abstract class ControlStatementAspect extends StatementAspect {
  @Abstract
  public static Scenario doStep(final ControlStatement _self) {
    final org.robot.k3project.ControlStatementAspectControlStatementAspectProperties _self_ = org.robot.k3project.ControlStatementAspectControlStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.ControlStatementAspect#Scenario doStep() from org.robot.k3project.ForwardStatementAspect
    		if (_self instanceof org.robot.model.robot.ForwardStatement){
    			result = org.robot.k3project.ForwardStatementAspect.doStep((org.robot.model.robot.ForwardStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ControlStatementAspect#Scenario doStep() from org.robot.k3project.ForwardStatementAspect
    	// BeginInjectInto org.robot.k3project.ControlStatementAspect#Scenario doStep() from org.robot.k3project.RightStatementAspect
    		if (_self instanceof org.robot.model.robot.RightStatement){
    			result = org.robot.k3project.RightStatementAspect.doStep((org.robot.model.robot.RightStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ControlStatementAspect#Scenario doStep() from org.robot.k3project.RightStatementAspect
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.ControlStatement){
    	result = org.robot.k3project.ControlStatementAspect._privk3_doStep(_self_, (org.robot.model.robot.ControlStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  protected static int step(final ControlStatement _self) {
    final org.robot.k3project.ControlStatementAspectControlStatementAspectProperties _self_ = org.robot.k3project.ControlStatementAspectControlStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# int step()
    if (_self instanceof org.robot.model.robot.ControlStatement){
    	result = org.robot.k3project.ControlStatementAspect._privk3_step(_self_, (org.robot.model.robot.ControlStatement)_self);
    };
    return (int)result;
  }
  
  protected static Scenario _privk3_doStep(final ControlStatementAspectControlStatementAspectProperties _self_, final ControlStatement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static int _privk3_step(final ControlStatementAspectControlStatementAspectProperties _self_, final ControlStatement _self) {
    try {
    	for (java.lang.reflect.Method m : _self.getClass().getMethods()) {
    		if (m.getName().equals("getStep") &&
    			m.getParameterTypes().length == 0) {
    				Object ret = m.invoke(_self);
    				if (ret != null) {
    					return (int) ret;
    				}		}
    	}
    } catch (Exception e) {
    	// Chut !
    }
    return _self_.step;
  }
}
