package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

public class SensorPotentiometer {

	private static AnalogPotentiometer potentiometer;
	
	static {
		potentiometer = new AnalogPotentiometer(0);
	}
	
	public static AnalogPotentiometer getPotentiometer() {
		return potentiometer;
	}

}
