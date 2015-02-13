package com.team5557.code2015;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Talon;

public class RobotMotorController {

	private static Map<Integer, Talon> motors;

	static {
		motors = new HashMap<Integer, Talon>();
	}

	public static void addMotor(int id) {
		motors.put(id, new Talon(id));
	}

	public static Talon getMotor(int id) {
		return motors.get(id);
	}

	public static boolean motorSpeed(int id, double speed) {
		if (motors.containsKey(id)) {
			getMotor(id).set(speed);
			return true;
		} else {
			return false;
		}
	}

}
