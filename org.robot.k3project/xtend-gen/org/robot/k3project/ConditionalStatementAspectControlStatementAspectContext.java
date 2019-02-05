package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ConditionalStatementAspectControlStatementAspectProperties;
import org.robot.model.robot.ControlStatement;

@SuppressWarnings("all")
public class ConditionalStatementAspectControlStatementAspectContext {
  public final static ConditionalStatementAspectControlStatementAspectContext INSTANCE = new ConditionalStatementAspectControlStatementAspectContext();
  
  public static ConditionalStatementAspectControlStatementAspectProperties getSelf(final ControlStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ConditionalStatementAspectControlStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ControlStatement, ConditionalStatementAspectControlStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.ControlStatement, org.robot.k3project.ConditionalStatementAspectControlStatementAspectProperties>();
  
  public Map<ControlStatement, ConditionalStatementAspectControlStatementAspectProperties> getMap() {
    return map;
  }
}
