package com.team5557.code2015;

import edu.wpi.first.wpilibj.Joystick.AxisType;

public class RobotController {

	public static void joystickControl() {
		RobotDriveController.joystickDrive();
		RobotMotorController.motorSpeed(1, RobotJoystickController.joystick()
				.getAxis(AxisType.kThrottle));
	}

}
