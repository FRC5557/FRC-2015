package com.team5557.code2015;

import com.team5557.code2015.autonomous.Autonomous;
import com.team5557.code2015.autonomous.programs.square.AutonomousSquare;

import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * 
 * Main class, contains all the base WPILib functions
 *
 */
public class Robot extends IterativeRobot {
	
	Autonomous auto;
	
	public void robotInit() {
	}

	public void autonomousInit() {
		auto = new AutonomousSquare();
	}

	/**
	 * Calls on AutonomousController to do its thing
	 */
	public void autonomousPeriodic() {
		auto.periodic();
	}

	/**
	 * Calls on drive controller to do its thing
	 */
	public void teleopPeriodic() {
		RobotDriveController.joystickDrive();
	}
}