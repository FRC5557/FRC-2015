package com.team5557.code2015;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

/**
 * 
 * Contains functions and variables relevant to controlling the drive of the
 * robot
 *
 */
public class RobotDriveController {

	/**
	 * Current static instance of RobotDrive
	 */
	private static RobotDrive drive;

	/**
	 * Calls the initDrive() function
	 */
	static {
		initDrive();
	}

	/**
	 * Initializes the drive - sets motor ports and inverts the motors so the
	 * steering is natural
	 */
	private static void initDrive() {
		drive = new RobotDrive(0, 1, 2, 3);
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
		drive.setInvertedMotor(MotorType.kFrontRight, true);
		drive.setInvertedMotor(MotorType.kRearLeft, true);
		drive.setInvertedMotor(MotorType.kRearRight, true);
	}

	/**
	 * Function to be called periodically that sends joystick inputs to the
	 * drive
	 */
	public static void joystickDrive() {
		drive().arcadeDrive(RobotJoystickController.joystick());
	}

	/**
	 * @return current RobotDrive instance
	 */
	public static RobotDrive drive() {
		return drive;
	}

}
