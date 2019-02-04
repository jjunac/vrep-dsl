package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.RobotAspectRobotAspectProperties;
import org.robot.model.robot.Robot;

@SuppressWarnings("all")
public class RobotAspectRobotAspectContext {
  public final static RobotAspectRobotAspectContext INSTANCE = new RobotAspectRobotAspectContext();
  
  public static RobotAspectRobotAspectProperties getSelf(final Robot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.RobotAspectRobotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Robot, RobotAspectRobotAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.Robot, org.robot.k3project.RobotAspectRobotAspectProperties>();
  
  public Map<Robot, RobotAspectRobotAspectProperties> getMap() {
    return map;
  }
}
