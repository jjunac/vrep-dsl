package org.robot.k3project;

import java.util.Map;
import org.robot.k3project.ScenarioAspectScenarioAspectProperties;
import org.robot.model.robot.Scenario;

@SuppressWarnings("all")
public class ScenarioAspectScenarioAspectContext {
  public final static ScenarioAspectScenarioAspectContext INSTANCE = new ScenarioAspectScenarioAspectContext();
  
  public static ScenarioAspectScenarioAspectProperties getSelf(final Scenario _self) {
    		if (!INSTANCE.map.containsKey(_self))
    			INSTANCE.map.put(_self, new org.robot.k3project.ScenarioAspectScenarioAspectProperties());
    		return INSTANCE.map.get(_self);
  }
  
  private Map<Scenario, ScenarioAspectScenarioAspectProperties> map = new java.util.WeakHashMap<org.robot.model.robot.Scenario, org.robot.k3project.ScenarioAspectScenarioAspectProperties>();
  
  public Map<Scenario, ScenarioAspectScenarioAspectProperties> getMap() {
    return map;
  }
}
