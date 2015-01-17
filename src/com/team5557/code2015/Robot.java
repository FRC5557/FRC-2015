package com.team5557.code2015;

import edu.wpi.first.wpilibj.IterativeRobot;

public class Robot extends IterativeRobot {
	public void robotInit() {
	}

	public void autonomousInit() {
	}

	public void autonomousPeriodic() {
		RobotAutonomousController.periodic();
	}

	public void teleopPeriodic() {
		RobotDriveController.joystickDrive();
	}
}