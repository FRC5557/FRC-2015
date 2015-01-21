package com.team5557.code2015.autonomous.programs.autononperiodic;

import java.util.ArrayList;

import com.team5557.code2015.autonomous.AutonomousAction;
import com.team5557.code2015.autonomous.AutonomousNonPeriodic;

public class AutonomousNonPeriodicTest implements AutonomousNonPeriodic {

	private ArrayList<AutonomousAction> actions;
	private AutonomousAction current;
	private int counter;
	
	public AutonomousNonPeriodicTest() {
		counter = 0;
		
		actions = new ArrayList<AutonomousAction>();
		actions.add(new AutonomousActionMoveForward());
		
		current = actions.get(0);
	}
	
	@Override
	public void runNextAction() {
		if(counter <= current.getRunLength()) {
			current.run();
		}
	}

}
