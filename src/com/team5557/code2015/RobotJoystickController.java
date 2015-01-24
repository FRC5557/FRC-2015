package com.team5557.code2015;

import edu.wpi.first.wpilibj.Joystick;

/**
 * 
 * Class containing any variables and relevant functions to the control inputs
 * of the robot
 *
 */
public class RobotJoystickController {

	/**
	 * Current joystick - program currently only supports one joystick
	 */
	private static Joystick joy;

	/**
	 * Sets current joystick to device set to port 0
	 */
	static {
		joy = new Joystick(0);
	}

	/**
	 * @return current Joystick instance
	 */
	public static Joystick joystick() {
		return joy;
	}

}
