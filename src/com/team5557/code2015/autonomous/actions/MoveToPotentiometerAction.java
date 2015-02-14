package com.team5557.code2015.autonomous.actions;

import com.team5557.code2015.RobotMotorController;
import com.team5557.code2015.RobotSensorController;
import com.team5557.code2015.autonomous.Action;
import com.team5557.code2015.utility.MathUtility;

/**
 * Action that extends the main actuator to the value in the constructor
 */
public class MoveToPotentiometerAction extends Action {

	private double reading;
	private boolean liftUpwards;

	/**
	 * Constructor, requires the reading that needs to be achieved
	 *
	 * @param potentiometerReading
	 */
	public MoveToPotentiometerAction(double potentiometerReading) {
		reading = potentiometerReading;
		double currentReading = RobotSensorController.getPotentiometer("main")
				.get();
		// if reading is less than the current potentiometer reading...
		if (reading > currentReading) {
			// conclude that actuator needs to push upwards
			liftUpwards = true;
		} else if (reading == MathUtility.round(currentReading, 2)) { // if
			// reading
			// is
			// within
			// 0.01
			// satisfy action
			setSatisfied(true);
		} else { // otherwise, we conclude the arm needs to go down
			liftUpwards = false;
		}
	}

	@Override
	protected void periodic() {
		double potentiometerReading = RobotSensorController.getPotentiometer(
				"main").get();
		if (liftUpwards) {
			RobotMotorController.motorSpeed(9, MathUtility.calculateCurve(
					reading, potentiometerReading, 1.0));
		} else {
			RobotMotorController.motorSpeed(
					9,
					-1 * MathUtility.calculateCurve(reading,
									potentiometerReading, 1.0));
		}
	}

	@Override
	protected void checkSatisfaction() {
		// checks for satisfaction of condition based on whether the arm needed
		// to go up or down
		if (liftUpwards) {
			if (RobotSensorController.getPotentiometer("main").get() >= reading) {
				setSatisfied(true);
			}
		} else {
			if (RobotSensorController.getPotentiometer("main").get() <= reading) {
				setSatisfied(true);
			}
		}
	}

}