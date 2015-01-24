package com.team5557.code2015.autonomous.programs;

import java.util.ArrayList;

import com.team5557.code2015.autonomous.AutonomousAction;
import com.team5557.code2015.autonomous.AutonomousNonPeriodic;
import com.team5557.code2015.autonomous.programs.actions.AutonomousActionMoveForward;

public class AutonomousNonPeriodicTest implements AutonomousNonPeriodic {

	private ArrayList<AutonomousAction> actions;
	private AutonomousAction current;
	private int counter;
	
	public AutonomousNonPeriodicTest() {
		counter = 0;
		
		actions = new ArrayList<AutonomousAction>();
		actions.add(new AutonomousActionMoveForward(100));
		
		current = actions.get(0);
	}
	
	@Override
	public void runNextAction() {
		if(counter <= current.getRunLength()) {
			current.run();
		}
	}

}
