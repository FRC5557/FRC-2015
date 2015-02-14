package com.team5557.code2015;

import com.team5557.code2015.autonomous.actions.MoveToPotentiometerAction;

public class RobotController {

	// Variable for the button actuator presets
	public static MoveToPotentiometerAction potentiometerAction;

	/**
	 * Does necessary robot initialization
	 */
	private static void initRobot() {
		// initializes potentiometer PWM port
		RobotMotorController.addMotor(0);
		RobotMotorController.addMotor(1);
		RobotMotorController.addMotor(2);
		RobotMotorController.addMotor(3);
		RobotMotorController.addMotor(9);
	}

	static {
		initRobot();
	}

	/**
	 * Called on by the main class to run every 20 msec
	 */
	public static void joystickControl() {
		RobotDriveController.joystickDrive();
		mainActuator();
		liftAction();
	}

	/**
	 * Checks if any of the button presets should be activated
	 */
	private static void liftAction() {
		boolean pos1 = RobotJoystickController.joystick().getRawButton(5);
		boolean pos2 = RobotJoystickController.joystick().getRawButton(3);
		boolean pos3 = RobotJoystickController.joystick().getRawButton(4);
		boolean pos4 = RobotJoystickController.joystick().getRawButton(6);

		// TODO set correct positions
		// if there is not a current potentiometer action...
		if (potentiometerAction == null) {
			// check if any of the preset buttons are activated
			if (pos1) {
				potentiometerAction = new MoveToPotentiometerAction(0.30);
			} else if (pos2) {
				potentiometerAction = new MoveToPotentiometerAction(0.50);
			} else if (pos3) {
				potentiometerAction = new MoveToPotentiometerAction(0.70);
			} else if (pos4) {
				potentiometerAction = new MoveToPotentiometerAction(0.85);
			}
		} else { // otherwise...
			// run current lift action
			potentiometerAction.run();
			// check if the correct height is reached
			if (potentiometerAction.isSatisfied()) {
				// reset potentiometer action
				potentiometerAction = null;
			}
		}
	}

	/**
	 * Controls for the actuator motor
	 */
	private static void mainActuator() {
		double reading = RobotSensorController.getPotentiometer("main").get();
		boolean up = RobotJoystickController.joystick().getRawButton(10);
		boolean down = RobotJoystickController.joystick().getRawButton(12);
		boolean slow = RobotJoystickController.joystick().getRawButton(2);

		// if any buttons are pressed, the preset lift action will be
		// interrupted
		if (slow || up || down) {
			potentiometerAction = null;
		}

		// if slow trigger is pressed...
		if (slow) {
			// sets actuator to push up, down, or stop depending on buttons
			// pressed
			if (up) {
				RobotMotorController.motorSpeed(9, 0.25);
			} else if (down) {
				RobotMotorController.motorSpeed(9, -0.25);
			} else {
				RobotMotorController.stopMotor(9);
			}
		} else if (down && reading > 0.25) { // if full speed down is activated,
			// and potentiometer is above
			// lower limit
			RobotMotorController.motorSpeed(9, -1.0);
		} else if (up && reading < 0.85) { // if full speed up is activated, and
			// potentiometer is below limit
			RobotMotorController.motorSpeed(9, 1.0);
		} else { // otherwise, stop motor
			RobotMotorController.stopMotor(9);
		}
	}

}
