package com.team5557.code2015.autonomous;


public interface AutonomousNonPeriodic extends Autonomous {
	
	public void runNextAction();
	
	@Override
	public default void periodic() {
		runNextAction();
	}
	
}
