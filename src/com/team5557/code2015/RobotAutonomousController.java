package com.team5557.code2015;

import com.team5557.code2015.autonomous.Autonomous;
import com.team5557.code2015.autonomous.AutonomousOne;

public class RobotAutonomousController {
	
	private static Autonomous current;

	static {
		current = new AutonomousOne();
	}
	
	public static void periodic() {
		current.periodic();
	}
	
	public static Autonomous getCurrent() {
		return current;
	}

}
