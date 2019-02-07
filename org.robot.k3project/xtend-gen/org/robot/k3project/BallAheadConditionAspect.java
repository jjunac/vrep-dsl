package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.BallAheadConditionAspectBallAheadConditionAspectProperties;
import org.robot.k3project.ConditionAspect;
import org.robot.model.robot.BallAheadCondition;

@Aspect(className = BallAheadCondition.class)
@SuppressWarnings("all")
public class BallAheadConditionAspect extends ConditionAspect {
  public static boolean eval(final BallAheadCondition _self) {
    final org.robot.k3project.BallAheadConditionAspectBallAheadConditionAspectProperties _self_ = org.robot.k3project.BallAheadConditionAspectBallAheadConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof org.robot.model.robot.BallAheadCondition){
    	result = org.robot.k3project.BallAheadConditionAspect._privk3_eval(_self_, (org.robot.model.robot.BallAheadCondition)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final BallAheadConditionAspectBallAheadConditionAspectProperties _self_, final BallAheadCondition _self) {
    return false;
  }
}
