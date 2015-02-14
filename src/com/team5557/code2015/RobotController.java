package com.team5557.code2015;

import com.team5557.code2015.autonomous.actions.LiftToPotentiometerAction;

public class RobotController {

	public static LiftToPotentiometerAction potentiometerAction;

	public static void joystickControl() {
		RobotDriveController.joystickDrive();
		mainActuator();
		liftAction();
	}

	private static void liftAction() {
		boolean pos1 = RobotJoystickController.joystick().getRawButton(1);
		boolean pos2 = RobotJoystickController.joystick().getRawButton(2);
		boolean pos3 = RobotJoystickController.joystick().getRawButton(3);
		boolean pos4 = RobotJoystickController.joystick().getRawButton(4);

		// TODO set correct positions
		if (potentiometerAction == null) {
			if (pos1) {
				potentiometerAction = new LiftToPotentiometerAction(0);
			} else if (pos2) {
				potentiometerAction = new LiftToPotentiometerAction(0);
			} else if (pos3) {
				potentiometerAction = new LiftToPotentiometerAction(0);
			} else if (pos4) {
				potentiometerAction = new LiftToPotentiometerAction(0);
			}
		} else {
			potentiometerAction.run();
			if (potentiometerAction.isSatisfied()) {
				potentiometerAction = null;
			}
		}
	}

	private static void mainActuator() {
		double reading = RobotSensorController.getPotentiometer("main").get();
		boolean up = RobotJoystickController.joystick().getRawButton(10);
		boolean down = RobotJoystickController.joystick().getRawButton(12);
		boolean slow = RobotJoystickController.joystick().getRawButton(2);

		if (slow || up || down) {
			potentiometerAction = null;
		}

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
