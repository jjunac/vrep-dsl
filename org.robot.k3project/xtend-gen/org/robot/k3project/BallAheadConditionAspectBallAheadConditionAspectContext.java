package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.BallAheadConditionAspectBallAheadConditionAspectProperties;
import org.robot.model.robot.BallAheadCondition;

@SuppressWarnings("all")
public class BallAheadConditionAspectBallAheadConditionAspectContext {
  public final static BallAheadConditionAspectBallAheadConditionAspectContext INSTANCE = new BallAheadConditionAspectBallAheadConditionAspectContext();
  
  public static BallAheadConditionAspectBallAheadConditionAspectProperties getSelf(final BallAheadCondition _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.BallAheadConditionAspectBallAheadConditionAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<BallAheadCondition, BallAheadConditionAspectBallAheadConditionAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.BallAheadCondition, org.robot.k3project.BallAheadConditionAspectBallAheadConditionAspectProperties>();
  
  public Map<BallAheadCondition, BallAheadConditionAspectBallAheadConditionAspectProperties> getMap() {
    return map;
  }
}
