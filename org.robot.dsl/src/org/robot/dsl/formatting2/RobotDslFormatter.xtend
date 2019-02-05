/*
 * generated by Xtext 2.14.0
 */
package org.robot.dsl.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.robot.dsl.services.RobotDslGrammarAccess
import org.robot.model.robot.Robot
import org.robot.model.robot.Scenario

class RobotDslFormatter extends AbstractFormatter2 {
	
	@Inject extension RobotDslGrammarAccess

	def dispatch void format(Robot robot, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (scenario : robot.scenarii) {
			scenario.format
		}
		robot.global.format
	}

	def dispatch void format(Scenario scenario, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (statement : scenario.statements) {
			statement.format
		}
	}
	
	// TODO: implement for UntilStatement
}
