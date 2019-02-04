package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ControlStatementAspectControlStatementAspectProperties;
import org.robot.model.robot.ControlStatement;

@SuppressWarnings("all")
public class ControlStatementAspectControlStatementAspectContext {
  public final static ControlStatementAspectControlStatementAspectContext INSTANCE = new ControlStatementAspectControlStatementAspectContext();
  
  public static ControlStatementAspectControlStatementAspectProperties getSelf(final ControlStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ControlStatementAspectControlStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStatement, ControlStatementAspectControlStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.ControlStatement, org.robot.k3project.ControlStatementAspectControlStatementAspectProperties>();
  
  public Map<ControlStatement, ControlStatementAspectControlStatementAspectProperties> getMap() {
    return map;
  }
}
