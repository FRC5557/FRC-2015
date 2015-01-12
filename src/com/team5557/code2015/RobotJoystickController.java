package com.team5557.code2015;

import edu.wpi.first.wpilibj.Joystick;

public class RobotJoystickController {
	
	private static Joystick joy;
	
	static {
		joy = new Joystick(0);
	}
	
	public static Joystick joystick() {
		return joy;
	}

}
