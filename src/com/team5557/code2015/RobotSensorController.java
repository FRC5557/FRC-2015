package com.team5557.code2015;

import com.team5557.code2015.sensors.SensorPotentiometer;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

public class RobotSensorController {
	
	public static AnalogPotentiometer getPotentiometer() {
		return SensorPotentiometer.getPotentiometer();
	}

}
