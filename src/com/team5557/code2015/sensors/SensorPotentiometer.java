package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

public class SensorPotentiometer {

	private AnalogPotentiometer potentiometer;

	public SensorPotentiometer(int id) {
		potentiometer = new AnalogPotentiometer(id);
	}

	public AnalogPotentiometer getPotentiometer() {
		return potentiometer;
	}

	public double get() {
		return 1 - potentiometer.get();
	}

}
