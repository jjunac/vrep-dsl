package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionAspect;
import org.robot.k3project.ConditionalStatementAspect;
import org.robot.k3project.WhileStatementAspectWhileStatementAspectProperties;
import org.robot.model.robot.WhileStatement;

@Aspect(className = WhileStatement.class)
@SuppressWarnings("all")
public class WhileStatementAspect extends ConditionalStatementAspect {
  public static String getType(final WhileStatement _self) {
    final org.robot.k3project.WhileStatementAspectWhileStatementAspectProperties _self_ = org.robot.k3project.WhileStatementAspectWhileStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getType()
    if (_self instanceof org.robot.model.robot.WhileStatement){
    	result = org.robot.k3project.WhileStatementAspect._privk3_getType(_self_, (org.robot.model.robot.WhileStatement)_self);
    };
    return (java.lang.String)result;
  }
  
  public static boolean shouldSkipBlock(final WhileStatement _self) {
    final org.robot.k3project.WhileStatementAspectWhileStatementAspectProperties _self_ = org.robot.k3project.WhileStatementAspectWhileStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean shouldSkipBlock()
    if (_self instanceof org.robot.model.robot.WhileStatement){
    	result = org.robot.k3project.WhileStatementAspect._privk3_shouldSkipBlock(_self_, (org.robot.model.robot.WhileStatement)_self);
    };
    return (boolean)result;
  }
  
  protected static String _privk3_getType(final WhileStatementAspectWhileStatementAspectProperties _self_, final WhileStatement _self) {
    return "while";
  }
  
  protected static boolean _privk3_shouldSkipBlock(final WhileStatementAspectWhileStatementAspectProperties _self_, final WhileStatement _self) {
    boolean _eval = ConditionAspect.eval(_self.getCondition());
    return (!_eval);
  }
}
