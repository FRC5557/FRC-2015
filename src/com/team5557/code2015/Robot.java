package com.team5557.code2015;

import com.team5557.code2015.autonomous.AutonomousController;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * 
 * Main class, contains all the base WPILib functions
 *
 */
public class Robot extends IterativeRobot {

	@Override
	public void robotInit() {
	}

	@Override
	public void autonomousInit() {
	}

	/**
	 * Calls on AutonomousController to do its thing
	 */
	@Override
	public void autonomousPeriodic() {
		AutonomousController.periodic();
	}

	/**
	 * Calls on drive controller to do its thing
	 */
	@Override
	public void teleopPeriodic() {
		RobotController.joystickControl();
		System.out
				.println(RobotSensorController.getPotentiometer("main").get());
	}
}