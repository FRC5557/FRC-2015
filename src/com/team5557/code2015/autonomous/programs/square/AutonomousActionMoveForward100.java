package com.team5557.code2015.autonomous.programs.square;

import com.team5557.code2015.RobotDriveController;
import com.team5557.code2015.autonomous.AutonomousAction;

public class AutonomousActionMoveForward100 implements AutonomousAction {

	@Override
	public void run() {
		RobotDriveController.drive().drive(1.0, 0.0);
	}

	@Override
	public int getRunLength() {
		return 100;
	}

}
