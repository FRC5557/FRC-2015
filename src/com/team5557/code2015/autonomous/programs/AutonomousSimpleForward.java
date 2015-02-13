package com.team5557.code2015.autonomous.programs;

import com.team5557.code2015.RobotDriveController;
import com.team5557.code2015.autonomous.Autonomous;

/**
 * 
 * Simple autonomous program that moves forward for about 2 seconds
 *
 */
public class AutonomousSimpleForward implements Autonomous {

	private int count = 0;

	/**
	 * Simply drives forward for 100 counts ~ 2 seconds
	 */
	@Override
	public void periodic() {
		if (count < 100) {
			RobotDriveController.drive().drive(1.0, 0.0);
		} else {
			RobotDriveController.drive().drive(0.0, 0.0);
		}
		count++;
	}

}
