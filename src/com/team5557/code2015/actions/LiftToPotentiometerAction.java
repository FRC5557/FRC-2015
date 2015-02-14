package com.team5557.code2015.actions;

import com.team5557.code2015.RobotMotorController;
import com.team5557.code2015.RobotSensorController;
import com.team5557.code2015.utility.MathUtility;

public class LiftToPotentiometerAction extends Action {
	
	private double reading;
	private boolean liftUpwards;
	
	public LiftToPotentiometerAction(double potentiometerReading) {
		reading = potentiometerReading;
		double currentReading = RobotSensorController.getPotentiometer("main").get();
		if(reading < currentReading) {
			liftUpwards = true;
		} else if(reading == MathUtility.round(currentReading, 2)) {
			setSatisfied(true);
		} else {
			liftUpwards = false;
		}
	}

	@Override
	protected void periodic() {
		if(liftUpwards) {
			RobotMotorController.motorSpeed(9, 0.5);
		} else {
			RobotMotorController.motorSpeed(9, -0.5);
		}
	}

	@Override
	protected void checkSatisfaction() {
		if(liftUpwards) {
			if(RobotSensorController.getPotentiometer("main").get() >= reading) {
				setSatisfied(true);
			}
		} else {
			if(RobotSensorController.getPotentiometer("main").get() <= reading) {
				setSatisfied(true);
			}
		}
	}

}