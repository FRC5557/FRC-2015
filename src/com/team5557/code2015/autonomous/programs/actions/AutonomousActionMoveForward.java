package com.team5557.code2015.autonomous.programs.actions;

import com.team5557.code2015.RobotDriveController;
import com.team5557.code2015.autonomous.AutonomousAction;

public class AutonomousActionMoveForward implements AutonomousAction {
	
	int count;
	
	public AutonomousActionMoveForward(int counts) {
		count = counts;
	}
	
	@Override
	public void run() {
		RobotDriveController.drive().drive(1.0, 0.0);
	}

	@Override
	public int getRunLength() {
		return count;	
	}

}
