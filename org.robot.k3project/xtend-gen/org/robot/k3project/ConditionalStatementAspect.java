package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Abstract;
import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.k3project.StatementBlockAspect;
import org.robot.model.robot.ConditionalStatement;
import org.robot.model.robot.Scenario;

@Aspect(className = ConditionalStatement.class)
@SuppressWarnings("all")
public abstract class ConditionalStatementAspect extends StatementAspect {
  public static void enter(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void enter()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	org.robot.k3project.ConditionalStatementAspect._privk3_enter(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
  }
  
  public static Scenario doStep(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# Scenario doStep()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_doStep(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (org.robot.model.robot.Scenario)result;
  }
  
  public static void exit(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    // #DispatchPointCut_before# void exit()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	org.robot.k3project.ConditionalStatementAspect._privk3_exit(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
  }
  
  @Abstract
  public static boolean shouldSkipBlock(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    	// BeginInjectInto org.robot.k3project.ConditionalStatementAspect#boolean shouldSkipBlock() from org.robot.k3project.UntilStatementAspect
    		if (_self instanceof org.robot.model.robot.UntilStatement){
    			result = org.robot.k3project.UntilStatementAspect.shouldSkipBlock((org.robot.model.robot.UntilStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ConditionalStatementAspect#boolean shouldSkipBlock() from org.robot.k3project.UntilStatementAspect
    	// BeginInjectInto org.robot.k3project.ConditionalStatementAspect#boolean shouldSkipBlock() from org.robot.k3project.WhileStatementAspect
    		if (_self instanceof org.robot.model.robot.WhileStatement){
    			result = org.robot.k3project.WhileStatementAspect.shouldSkipBlock((org.robot.model.robot.WhileStatement)_self);
    		} else
    		// EndInjectInto org.robot.k3project.ConditionalStatementAspect#boolean shouldSkipBlock() from org.robot.k3project.WhileStatementAspect
    // #DispatchPointCut_before# boolean shouldSkipBlock()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_shouldSkipBlock(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (boolean)result;
  }
  
  public static boolean isFinished(final ConditionalStatement _self) {
    final org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties _self_ = org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean isFinished()
    if (_self instanceof org.robot.model.robot.ConditionalStatement){
    	result = org.robot.k3project.ConditionalStatementAspect._privk3_isFinished(_self_, (org.robot.model.robot.ConditionalStatement)_self);
    };
    return (boolean)result;
  }
  
  protected static void _privk3_enter(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    StatementBlockAspect.enter(_self.getStatementBlock());
  }
  
  protected static Scenario _privk3_doStep(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    boolean _shouldSkipBlock = ConditionalStatementAspect.shouldSkipBlock(_self);
    boolean _not = (!_shouldSkipBlock);
    if (_not) {
      return StatementBlockAspect.step(_self.getStatementBlock());
    }
    return null;
  }
  
  protected static void _privk3_exit(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    StatementBlockAspect.exit(_self.getStatementBlock());
  }
  
  protected static boolean _privk3_shouldSkipBlock(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    throw new java.lang.RuntimeException("Not implemented");
  }
  
  protected static boolean _privk3_isFinished(final ConditionalStatementAspectConditionalStatementAspectProperties _self_, final ConditionalStatement _self) {
    return ConditionalStatementAspect.shouldSkipBlock(_self);
  }
}
