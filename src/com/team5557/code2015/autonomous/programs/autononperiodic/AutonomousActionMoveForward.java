package com.team5557.code2015.autonomous.programs.autononperiodic;

import com.team5557.code2015.RobotDriveController;
import com.team5557.code2015.autonomous.AutonomousAction;

public class AutonomousActionMoveForward implements AutonomousAction {

	@Override
	public void run() {
		RobotDriveController.drive().drive(1.0, 0.0);
	}

	@Override
	public int getRunLength() {
		return 100;	
	}

}
