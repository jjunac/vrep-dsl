package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionAspect;
import org.robot.k3project.ConditionalStatementAspect;
import org.robot.k3project.IfStatementAspectIfStatementAspectProperties;
import org.robot.k3project.StatementAspect;
import org.robot.model.robot.IfStatement;

@Aspect(className = IfStatement.class)
@SuppressWarnings("all")
public class IfStatementAspect extends ConditionalStatementAspect {
  public static boolean shouldSkipBlock(final IfStatement _self) {
    final org.robot.k3project.IfStatementAspectIfStatementAspectProperties _self_ = org.robot.k3project.IfStatementAspectIfStatementAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean shouldSkipBlock()
    if (_self instanceof org.robot.model.robot.IfStatement){
    	result = org.robot.k3project.IfStatementAspect._privk3_shouldSkipBlock(_self_, (org.robot.model.robot.IfStatement)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_shouldSkipBlock(final IfStatementAspectIfStatementAspectProperties _self_, final IfStatement _self) {
    return ((!ConditionAspect.eval(_self.getCondition())) || (!StatementAspect.firstStep(_self)));
  }
}
