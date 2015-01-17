package com.team5557.code2015.autonomous;

/**
 * 
 * The main purpose of this interface is to allow all Autonomous problems to be
 * defined under a single type declaration
 *
 */
public interface Autonomous {
	
	/**
	 * Every Autonomous program should have a function that runs the tasks
	 * programmed in a manner to be suitable for repetition every 20 msec
	 */
	public void periodic();
	
}
