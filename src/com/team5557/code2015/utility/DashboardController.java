package com.team5557.code2015.utility;

import com.team5557.code2015.RobotMotorController;
import com.team5557.code2015.RobotSensorController;
import com.team5557.code2015.sensors.SensorBuiltInAccelerometer;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * Anything related to SmartDashboard output goes here
 */
public class DashboardController {

	/**
	 * Function to be called periodically
	 */
	public static void putData() {
		// Put main actuator percentage
		SmartDashboard.putNumber("Potentiometer Percent", RobotSensorController
				.getPotentiometer("main").getPercent());
		// Put accelerometer data
		SmartDashboard.putNumber("Accelerometer X",
				SensorBuiltInAccelerometer.getX());
		SmartDashboard.putNumber("Accelerometer Y",
				SensorBuiltInAccelerometer.getY());
		SmartDashboard.putNumber("Accelerometer Z",
				SensorBuiltInAccelerometer.getZ());
		// Put speed data from all motors
		for(Talon tal : RobotMotorController.getMotors().values()) {
			SmartDashboard.putNumber("Motor " + tal.getChannel(), tal.get());
		}
	}

}
