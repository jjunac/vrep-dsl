package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ForwardStatementAspectForwardStatementAspectProperties;
import org.robot.model.robot.ForwardStatement;

@SuppressWarnings("all")
public class ForwardStatementAspectForwardStatementAspectContext {
  public final static ForwardStatementAspectForwardStatementAspectContext INSTANCE = new ForwardStatementAspectForwardStatementAspectContext();
  
  public static ForwardStatementAspectForwardStatementAspectProperties getSelf(final ForwardStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ForwardStatementAspectForwardStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ForwardStatement, ForwardStatementAspectForwardStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.ForwardStatement, org.robot.k3project.ForwardStatementAspectForwardStatementAspectProperties>();
  
  public Map<ForwardStatement, ForwardStatementAspectForwardStatementAspectProperties> getMap() {
    return map;
  }
}
