package com.team5557.code2015.autonomous;

import com.team5557.code2015.RobotDriveController;

public class AutonomousOne implements Autonomous {
	

	@Override
	public void run() {
		RobotDriveController.drive().drive(1.0, 0.0);
	}
	
	@Override
	public void stop() {
		RobotDriveController.drive().drive(0.0, 0.0);
	}

	@Override
	public long getTime() {
		return 3000;
	}

}
