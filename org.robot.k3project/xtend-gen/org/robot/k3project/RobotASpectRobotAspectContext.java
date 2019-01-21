package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.RobotASpectRobotAspectProperties;
import org.robot.model.robot.Robot;

@SuppressWarnings("all")
public class RobotASpectRobotAspectContext {
  public final static RobotASpectRobotAspectContext INSTANCE = new RobotASpectRobotAspectContext();
  
  public static RobotASpectRobotAspectProperties getSelf(final Robot _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.RobotASpectRobotAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Robot, RobotASpectRobotAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.Robot, org.robot.k3project.RobotASpectRobotAspectProperties>();
  
  public Map<Robot, RobotASpectRobotAspectProperties> getMap() {
    return map;
  }
}
