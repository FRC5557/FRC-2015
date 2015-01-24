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
	
	@Override
	public void robotInit() {
	}

	@Override
	public void autonomousInit() {
		auto = new AutonomousSquare();
	}

	/**
	 * Calls on AutonomousController to do its thing
	 */
	@Override
	public void autonomousPeriodic() {
		auto.periodic();
	}

	/**
	 * Calls on drive controller to do its thing
	 */
	@Override
	public void teleopPeriodic() {
		RobotDriveController.joystickDrive();
	}
}