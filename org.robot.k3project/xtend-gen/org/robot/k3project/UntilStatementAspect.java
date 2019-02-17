package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionAspect;
import org.robot.k3project.ConditionalStatementAspect;
import org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties;
import org.robot.model.robot.UntilStatement;

@Aspect(className = UntilStatement.class)
@SuppressWarnings("all")
public class UntilStatementAspect extends ConditionalStatementAspect {
  public static String getType(final UntilStatement _self) {
    final org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties _self_ = org.robot.k3project.UntilStatementAspectUntilStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# String getType()
    if (_self instanceof org.robot.model.robot.UntilStatement){
    	result = org.robot.k3project.UntilStatementAspect._privk3_getType(_self_, (org.robot.model.robot.UntilStatement)_self);
    };
    return (java.lang.String)result;
  }
  
  public static boolean shouldSkipBlock(final UntilStatement _self) {
    final org.robot.k3project.UntilStatementAspectUntilStatementAspectProperties _self_ = org.robot.k3project.UntilStatementAspectUntilStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean shouldSkipBlock()
    if (_self instanceof org.robot.model.robot.UntilStatement){
    	result = org.robot.k3project.UntilStatementAspect._privk3_shouldSkipBlock(_self_, (org.robot.model.robot.UntilStatement)_self);
    };
    return (boolean)result;
  }
  
  protected static String _privk3_getType(final UntilStatementAspectUntilStatementAspectProperties _self_, final UntilStatement _self) {
    return "until";
  }
  
  protected static boolean _privk3_shouldSkipBlock(final UntilStatementAspectUntilStatementAspectProperties _self_, final UntilStatement _self) {
    return ConditionAspect.eval(_self.getCondition());
  }
}
