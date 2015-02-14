package com.team5557.code2015.utility;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtility {

	/**
	 * Taken from
	 * http://stackoverflow.com/questions/2808535/round-a-double-to-2-
	 * decimal-places
	 *
	 * @param value
	 * @param places
	 * @return rounded decimal
	 */
	public static double round(double value, int places) {
		if (places < 0) {
			throw new IllegalArgumentException();
		}

		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(places, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}
	
	/**
	 * Function calculates an output value that is curved as to stop the motors more accurately
	 * Based on goal value and the current value
	 * @param goal
	 * @param current
	 * @param slowValue the multiplier for the slowdown, varies based on motor type
	 * function is adjusted so that a value of 1.0 is for the main actuator
	 * @return output power from 0.0 to 1.0, may need to be negated
	 */
	public static double calculateCurve(double goal, double current, double slowValue) {
		//values are squared so that they are not negative
		goal = Math.pow(goal, 2);
		current = Math.pow(current, 2);
		
		if((goal-current) <= (0.10 * slowValue)) {
			return 0.5;
		} else if((goal-current) <= (0.05 * slowValue)) {
			return 0.3;
		} else if((goal-current) <= (0.02 * slowValue)) {
			return 0.2;
		} else {
			return 1.0;
		}
	
	}

}
