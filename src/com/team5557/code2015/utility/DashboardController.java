package com.team5557.code2015.utility;

import com.team5557.code2015.RobotSensorController;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DashboardController {
	
	public static void putData() {
		SmartDashboard.putNumber("Potentiometer Percent", RobotSensorController.getPotentiometer("main").getPercent());
	}

}
