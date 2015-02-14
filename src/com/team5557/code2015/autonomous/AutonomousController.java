package com.team5557.code2015.autonomous;

import com.team5557.code2015.actions.ActionSet;
import com.team5557.code2015.autonomous.programs.AutonomousSquare;

/**
 * 
 * This class is used to quickly switch between autonomous programs While a
 * hardware solution is feasible, we temporarily decided to go with a software
 * solution
 * 
 **/
public class AutonomousController {

	/**
	 * Generalized Autonomous type variable to contain specific program
	 */
	private static ActionSet current;

	/**
	 * Sets the value of the 'current' variable to the necessary autonomous
	 * program
	 */
	static {
		current = new AutonomousSquare();
	}

	/**
	 * Simply refers to the 'current' autonomous program's periodic method
	 */
	public static void periodic() {
		current.runActions();
	}

	/**
	 * @return current Autonomous program
	 */
	public static ActionSet getCurrent() {
		return current;
	}

}
