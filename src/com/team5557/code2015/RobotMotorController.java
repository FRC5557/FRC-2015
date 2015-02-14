package com.team5557.code2015;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.wpilibj.Talon;

/**
 *
 * Class for Motors that do not belong to the drive
 *
 */
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

	public static Map<Integer, Talon> getMotors() {
		return motors;
	}

	/**
	 * Gets motor from hashmap by id and sets its speed
	 *
	 * @param id
	 * @param speed
	 * @return whether motor was found in HashMap
	 */
	public static boolean motorSpeed(int id, double speed) {
		if (motors.containsKey(id)) {
			getMotor(id).set(speed);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * stops motor based on id
	 *
	 * @param id
	 * @return whether motor id was found in HashMap
	 */
	public static boolean stopMotor(int id) {
		return motorSpeed(id, 0.0);
	}

}
