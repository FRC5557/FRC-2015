package com.team5557.code2015;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;

public class RobotDriveController {
	private static RobotDrive drive;
	
	
	static {
		initDrive();
	}
	
	private static void initDrive() {
		drive = new RobotDrive(0, 1, 2, 3);
		drive.setInvertedMotor(MotorType.kFrontLeft, true);
        drive.setInvertedMotor(MotorType.kFrontRight, true);
        drive.setInvertedMotor(MotorType.kRearLeft, true);
        drive.setInvertedMotor(MotorType.kRearRight, true);
	}
	
	public static void joystickDrive() {
		drive.arcadeDrive(RobotJoystickController.joystick());
	}
	
	public static RobotDrive drive() {
		return drive;
	}
	
}
