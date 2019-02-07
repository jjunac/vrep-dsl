package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties;
import org.robot.model.robot.ConditionalStatement;

@SuppressWarnings("all")
public class ConditionalStatementAspectConditionalStatementAspectContext {
  public final static ConditionalStatementAspectConditionalStatementAspectContext INSTANCE = new ConditionalStatementAspectConditionalStatementAspectContext();
  
  public static ConditionalStatementAspectConditionalStatementAspectProperties getSelf(final ConditionalStatement _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<ConditionalStatement, ConditionalStatementAspectConditionalStatementAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.ConditionalStatement, org.robot.k3project.ConditionalStatementAspectConditionalStatementAspectProperties>();
  
  public Map<ConditionalStatement, ConditionalStatementAspectConditionalStatementAspectProperties> getMap() {
    return map;
  }
}
