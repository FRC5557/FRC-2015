package com.team5557.code2015.autonomous.actions;

import com.team5557.code2015.RobotDriveController;
import com.team5557.code2015.actions.Action;

public class AutonomousActionMoveForward extends Action {

	int totalCount;
	int currentCount;

	public AutonomousActionMoveForward(int counts) {
		totalCount = counts;
		currentCount++;
	}

	@Override
	protected void periodic() {
		RobotDriveController.drive().drive(1.0, 0.0);
		currentCount++;
	}

	@Override
	protected void checkSatisfaction() {
		if (currentCount >= totalCount) {
			setSatisfied(true);
		}
	}

}
