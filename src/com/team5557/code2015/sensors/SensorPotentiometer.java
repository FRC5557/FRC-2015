package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

/**
 * Wrapper class for the WPILib built in potentiometer class Modifies output
 * values and adds more methods
 */
public class SensorPotentiometer {

	private AnalogPotentiometer potentiometer;
	private double low_val;
	private double high_val;

	/**
	 * Builder is based on port id
	 *
	 * @param id
	 */
	public SensorPotentiometer(int id, double low, double high) {
		potentiometer = new AnalogPotentiometer(id);
		low_val = low;
		high_val = high;
	}

	/**
	 * Returns percent height based on lowest and highest values the
	 * potentiometer can have
	 *
	 * @return percent
	 */
	public int getPercent() {
		double percent = (get() + low_val) / high_val * 100.0;
		if (percent >= 100.0) {
			return 100;
		} else {
			return (int) Math.floor(percent);
		}
	}

	public AnalogPotentiometer getPotentiometer() {
		return potentiometer;
	}

	/**
	 * Returns the inverted potentiometer value...because we screwed up the
	 * wiring Not much of a problem though
	 */
	public double get() {
		return 1 - potentiometer.get();
	}

}
