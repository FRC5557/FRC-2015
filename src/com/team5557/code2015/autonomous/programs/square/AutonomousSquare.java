package com.team5557.code2015.autonomous.programs.square;

import java.util.ArrayList;

import com.team5557.code2015.autonomous.AutonomousAction;
import com.team5557.code2015.autonomous.AutonomousNonPeriodic;
import com.team5557.code2015.autonomous.programs.actions.AutonomousActionMoveForward;
import com.team5557.code2015.autonomous.programs.actions.AutonomousActionTurnRight;

public class AutonomousSquare implements AutonomousNonPeriodic {
	
	private ArrayList<AutonomousAction> actions;
	private AutonomousAction current;
	private int counter;
	private int currentId;
	
	public AutonomousSquare() {
		counter = 0;
		currentId = 0;
		
		actions = new ArrayList<AutonomousAction>();
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(1000));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		
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
