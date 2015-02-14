package com.team5557.code2015;

import java.util.HashMap;
import java.util.Map;

import com.team5557.code2015.sensors.SensorPotentiometer;
import com.team5557.code2015.sensors.SensorUltrasonic;

/**
 * Class that contains all the sensors that robots are using and gives easy
 * access to their values
 */
public class RobotSensorController {

	private static Map<String, SensorPotentiometer> potentiometers;
	private static Map<String, SensorUltrasonic> ultrasonics;

	static {
		potentiometers = new HashMap<String, SensorPotentiometer>();
		ultrasonics = new HashMap<String, SensorUltrasonic>();

		// initializes currently used sensors
		potentiometers.put("main", new SensorPotentiometer(0));
		ultrasonics.put("main", new SensorUltrasonic(0, 1));
	}

	public static SensorPotentiometer getPotentiometer(String id) {
		return potentiometers.get(id);
	}

	public static SensorUltrasonic getUltrasonic(String id) {
		return ultrasonics.get(id);
	}

}
