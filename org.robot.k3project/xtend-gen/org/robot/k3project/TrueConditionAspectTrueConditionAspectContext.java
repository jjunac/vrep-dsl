package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.TrueConditionAspectTrueConditionAspectProperties;
import org.robot.model.robot.TrueCondition;

@SuppressWarnings("all")
public class TrueConditionAspectTrueConditionAspectContext {
  public final static TrueConditionAspectTrueConditionAspectContext INSTANCE = new TrueConditionAspectTrueConditionAspectContext();
  
  public static TrueConditionAspectTrueConditionAspectProperties getSelf(final TrueCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.TrueConditionAspectTrueConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<TrueCondition, TrueConditionAspectTrueConditionAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.TrueCondition, org.robot.k3project.TrueConditionAspectTrueConditionAspectProperties>();
  
  public Map<TrueCondition, TrueConditionAspectTrueConditionAspectProperties> getMap() {
    return map;
  }
}
