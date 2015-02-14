package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.Ultrasonic;

/**
 * Wrapper class for WPILib Ultrasonic sensor
 */
public class SensorUltrasonic {

	private Ultrasonic ultrasonic;

	/**
	 * Constructor requires two ports - one input and output This class is made
	 * for a ping and respond potentiometer
	 * 
	 * @param inputPort
	 * @param outputPort
	 */
	public SensorUltrasonic(int inputPort, int outputPort) {
		ultrasonic = new Ultrasonic(outputPort, inputPort);
	}

	public Ultrasonic getUltrasonic() {
		return ultrasonic;
	}

}
