package com.team5557.code2015;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * 
 * Main class, contains all the base WPILib functions
 *
 */
public class Robot extends IterativeRobot {
	
	public void robotInit() {
	}

	public void autonomousInit() {
	}

	/**
	 * Calls on AutonomousController to do its thing
	 */
	public void autonomousPeriodic() {
		
	}

	/**
	 * Calls on drive controller to do its thing
	 */
	public void teleopPeriodic() {
		RobotDriveController.joystickDrive();
	}
}