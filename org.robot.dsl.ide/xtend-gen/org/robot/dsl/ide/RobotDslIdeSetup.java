/**
 * generated by Xtext 2.14.0
 */
package org.robot.dsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.robot.dsl.RobotDslRuntimeModule;
import org.robot.dsl.RobotDslStandaloneSetup;
import org.robot.dsl.ide.RobotDslIdeModule;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class RobotDslIdeSetup extends RobotDslStandaloneSetup {
  @Override
  public Injector createInjector() {
    RobotDslRuntimeModule _robotDslRuntimeModule = new RobotDslRuntimeModule();
    RobotDslIdeModule _robotDslIdeModule = new RobotDslIdeModule();
    return Guice.createInjector(Modules2.mixin(_robotDslRuntimeModule, _robotDslIdeModule));
  }
}