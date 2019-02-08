package org.robot.k3project;

import fr.inria.diverse.k3.al.annotationprocessor.Aspect;
import org.robot.k3project.ConditionAspect;
import org.robot.k3project.ObjectAheadConditionAspectObjectAheadConditionAspectProperties;
import org.robot.model.robot.ObjectAheadCondition;

@Aspect(className = ObjectAheadCondition.class)
@SuppressWarnings("all")
public class ObjectAheadConditionAspect extends ConditionAspect {
  public static boolean eval(final ObjectAheadCondition _self) {
    final org.robot.k3project.ObjectAheadConditionAspectObjectAheadConditionAspectProperties _self_ = org.robot.k3project.ObjectAheadConditionAspectObjectAheadConditionAspectContext.getSelf(_self);
    Object result = null;
    // #DispatchPointCut_before# boolean eval()
    if (_self instanceof org.robot.model.robot.ObjectAheadCondition){
    	result = org.robot.k3project.ObjectAheadConditionAspect._privk3_eval(_self_, (org.robot.model.robot.ObjectAheadCondition)_self);
    };
    return (boolean)result;
  }
  
  protected static boolean _privk3_eval(final ObjectAheadConditionAspectObjectAheadConditionAspectProperties _self_, final ObjectAheadCondition _self) {
    return false;
  }
}
