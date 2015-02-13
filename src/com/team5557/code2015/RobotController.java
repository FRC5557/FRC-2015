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
		if(up && reading < 0.85) {
			RobotMotorController.motorSpeed(9, 1.0);
		} else if (down && reading > 0.20) {
			RobotMotorController.motorSpeed(9, -1.0);
		} else {
			RobotMotorController.motorSpeed(9, 0.0);
		}
	}

}
