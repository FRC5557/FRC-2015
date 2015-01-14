package com.team5557.code2015.autonomous;

import com.team5557.code2015.RobotDriveController;

public class AutonomousOne implements Autonomous {
	
	int count = 0;
	
	@Override
	public void periodic() {
		if(count < 100) {
			RobotDriveController.drive().drive(1.0, 0.0);
		} else {
			RobotDriveController.drive().drive(0.0, 0.0);
		}
		count++;
	}
	

}
