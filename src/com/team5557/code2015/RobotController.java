package com.team5557.code2015;

public class RobotController {

	public static void joystickControl() {
		RobotDriveController.joystickDrive();
		mainActuator();
	}

	private static void mainActuator() {
		double reading = RobotSensorController.getPotentiometer("main").get();
		double axis = RobotJoystickController.joystick().getThrottle();
		if (axis > 0.0 && reading < 0.85) {
			RobotMotorController.motorSpeed(9, axis);
			System.out.println("up");
		}
		if (axis < 0.0 && reading > 0.12) {
			RobotMotorController.motorSpeed(9, axis);
			System.out.println("down");
		}
	}

}
