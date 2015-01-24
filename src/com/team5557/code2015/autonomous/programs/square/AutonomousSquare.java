package com.team5557.code2015.autonomous.programs.square;

import java.util.ArrayList;

import com.team5557.code2015.autonomous.AutonomousAction;
import com.team5557.code2015.autonomous.AutonomousNonPeriodic;

public class AutonomousSquare implements AutonomousNonPeriodic {
	
	private ArrayList<AutonomousAction> actions;
	private AutonomousAction current;
	private int counter;
	private int currentId;
	
	public AutonomousSquare() {
		counter = 0;
		currentId = 0;
		
		actions = new ArrayList<AutonomousAction>();
		actions.add(new AutonomousActionMoveForward100());
		actions.add(new AutonomousActionTurnRight90());
		actions.add(new AutonomousActionMoveForward100());
		actions.add(new AutonomousActionTurnRight90());
		actions.add(new AutonomousActionMoveForward100());
		actions.add(new AutonomousActionTurnRight90());
		actions.add(new AutonomousActionMoveForward100());
		actions.add(new AutonomousActionTurnRight90());
		
		current = actions.get(currentId);
	}

	@Override
	public void runNextAction() {
		if(counter <= current.getRunLength()) {
			current.run();
			counter++;
		} else if((currentId + 1) < actions.size()) {
			currentId++;
			counter = 0;
			current = actions.get(currentId);
		}
	}

}
