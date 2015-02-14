package com.team5557.code2015.autonomous;

import java.util.ArrayList;

import com.team5557.code2015.actions.ActionSet;

public abstract class Autonomous extends ActionSet {

	public Autonomous() {
		actions = new ArrayList<AutonomousAction>();
		counter = 0;
		currentId = 0;
	}

	protected ArrayList<AutonomousAction> actions;
	protected AutonomousAction current;
	protected int counter;
	protected int currentId;

	@Override
	public void runActions() {
		if (counter <= current.getRunLength()) {
			current.run();
			counter++;
		} else if ((currentId + 1) < actions.size()) {
			currentId++;
			counter = 0;
			current = actions.get(currentId);
		}
	}

	public void periodic() {
		runActions();
	}

}
