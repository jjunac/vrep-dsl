package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.IfStatementAspectIfStatementAspectProperties;
import org.robot.model.robot.IfStatement;

@SuppressWarnings("all")
public class IfStatementAspectIfStatementAspectContext {
  public final static IfStatementAspectIfStatementAspectContext INSTANCE = new IfStatementAspectIfStatementAspectContext();
  
  public static IfStatementAspectIfStatementAspectProperties getSelf(final IfStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.IfStatementAspectIfStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<IfStatement, IfStatementAspectIfStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.IfStatement, org.robot.k3project.IfStatementAspectIfStatementAspectProperties>();
  
  public Map<IfStatement, IfStatementAspectIfStatementAspectProperties> getMap() {
    return map;
  }
}
