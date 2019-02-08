package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ObjectAheadConditionAspectObjectAheadConditionAspectProperties;
import org.robot.model.robot.ObjectAheadCondition;

@SuppressWarnings("all")
public class ObjectAheadConditionAspectObjectAheadConditionAspectContext {
  public final static ObjectAheadConditionAspectObjectAheadConditionAspectContext INSTANCE = new ObjectAheadConditionAspectObjectAheadConditionAspectContext();
  
  public static ObjectAheadConditionAspectObjectAheadConditionAspectProperties getSelf(final ObjectAheadCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ObjectAheadConditionAspectObjectAheadConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ObjectAheadCondition, ObjectAheadConditionAspectObjectAheadConditionAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.ObjectAheadCondition, org.robot.k3project.ObjectAheadConditionAspectObjectAheadConditionAspectProperties>();
  
  public Map<ObjectAheadCondition, ObjectAheadConditionAspectObjectAheadConditionAspectProperties> getMap() {
    return map;
  }
}
