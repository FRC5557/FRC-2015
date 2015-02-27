package com.team5557.code2015;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {

	/**
	 * Runs every 20 msec during Autonomous period Calls on AutonomousController
	 * to do its thing Calls on the Dashboard controller to put data on the
	 * SmartDashboard
	 */
	@Override
	public void autonomousPeriodic() {
	}

	/**
	 * Runs every 20 msec during Autonomous period Calls on RobotController to
	 * do its thing Calls on the Dashboard controller to put data on the
	 * SmartDashboard
	 */
	@Override
	public void teleopPeriodic() {
		RobotController.joystickControl();
	}
}