/*
 * generated by Xtext 2.14.0
 */
package org.robot.dsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class RobotDslStandaloneSetup extends RobotDslStandaloneSetupGenerated {

	def static void doSetup() {
		new RobotDslStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}