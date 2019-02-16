package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionAspect;
import org.robot.k3project.TrueConditionAspectTrueConditionAspectProperties;
import org.robot.model.robot.TrueCondition;

@Aspect(className = TrueCondition.class)
@SuppressWarnings("all")
public class TrueConditionAspect extends ConditionAspect {
  public static boolean eval(final TrueCondition _self) {
    final org.robot.k3project.TrueConditionAspectTrueConditionAspectProperties _self_ = org.robot.k3project.TrueConditionAspectTrueConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof org.robot.model.robot.TrueCondition){
    	result = org.robot.k3project.TrueConditionAspect._privk3_eval(_self_, (org.robot.model.robot.TrueCondition)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final TrueConditionAspectTrueConditionAspectProperties _self_, final TrueCondition _self) {
    return true;
  }
}
