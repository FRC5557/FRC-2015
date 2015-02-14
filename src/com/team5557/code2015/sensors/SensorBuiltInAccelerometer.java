package com.team5557.code2015.sensors;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;

public class SensorBuiltInAccelerometer {
	
	private static BuiltInAccelerometer accel;
	
	static {
		accel = new BuiltInAccelerometer();
	}
	
	public static double getX() {
		return accel.getX();
	}
	
	public static double getY() {
		return accel.getY();
	}
	
	public static double getZ() {
		return accel.getZ();
	}
}
