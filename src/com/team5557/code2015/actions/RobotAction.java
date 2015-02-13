package com.team5557.code2015.actions;

import java.util.ArrayList;

import com.team5557.code2015.autonomous.AutonomousAction;

public abstract class RobotAction implements Periodic {
	
	protected ArrayList<AutonomousAction> actions;
	protected AutonomousAction current;
	protected int counter;
	protected int currentId;

	public RobotAction() {
		
	}
	
	@Override
	public void periodic() {
		
	}
	
}
