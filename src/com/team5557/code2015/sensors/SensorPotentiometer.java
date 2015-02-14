package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

public class SensorPotentiometer {

	private AnalogPotentiometer potentiometer;

	public SensorPotentiometer(int id) {
		potentiometer = new AnalogPotentiometer(id);
	}

	public int getPercent() {
		double percent = (get() + 0.03) / 0.87 * 100.0;
		if (percent >= 100.0) {
			return 100;
		} else {
			return (int) Math.floor(percent);
		}
	}

	public AnalogPotentiometer getPotentiometer() {
		return potentiometer;
	}

	public double get() {
		return 1 - potentiometer.get();
	}

}
