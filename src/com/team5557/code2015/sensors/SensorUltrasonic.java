package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.Ultrasonic;

public class SensorUltrasonic {

	private Ultrasonic ultrasonic;

	public SensorUltrasonic(int inputPort, int outputPort) {
		ultrasonic = new Ultrasonic(outputPort, inputPort);
	}

	public Ultrasonic get() {
		return ultrasonic;
	}

}
