package com.team5557.code2015;

public class RobotController {

	public static void joystickControl() {
		RobotDriveController.joystickDrive();
		mainActuator();
	}

	private static void mainActuator() {
		double reading = RobotSensorController.getPotentiometer("main").get();
		boolean up = RobotJoystickController.joystick().getRawButton(10);
		boolean down = RobotJoystickController.joystick().getRawButton(12);
		boolean slow = RobotJoystickController.joystick().getRawButton(2);
		if (slow) {
			if (up) {
				RobotMotorController.motorSpeed(9, 0.25);
			} else if (down) {
				RobotMotorController.motorSpeed(9, -0.25);
			} else {
				RobotMotorController.stopMotor(9);
			}
		} else if (down && reading > 0.25) {
			RobotMotorController.motorSpeed(9, -1.0);
		} else if (up && reading < 0.85) {
			RobotMotorController.motorSpeed(9, 1.0);
		} else {
			RobotMotorController.stopMotor(9);
		}
	}

}
