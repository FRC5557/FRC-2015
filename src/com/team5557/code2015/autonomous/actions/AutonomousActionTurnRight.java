package com.team5557.code2015.autonomous.actions;

import com.team5557.code2015.RobotDriveController;
import com.team5557.code2015.autonomous.AutonomousAction;

public class AutonomousActionTurnRight implements AutonomousAction {

	int count;

	public AutonomousActionTurnRight(int counts) {
		count = counts;
	}

	@Override
	public void run() {
		RobotDriveController.drive().drive(1.0, 1.0);
	}

	@Override
	public int getRunLength() {
		return count;
	}

}
