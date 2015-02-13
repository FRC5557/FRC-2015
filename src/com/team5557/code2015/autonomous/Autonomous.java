package com.team5557.code2015.autonomous;

import java.util.ArrayList;

public abstract class Autonomous {

	public Autonomous() {
		actions = new ArrayList<AutonomousAction>();
		counter = 0;
		currentId = 0;
	}

	protected ArrayList<AutonomousAction> actions;
	protected AutonomousAction current;
	protected int counter;
	protected int currentId;

	public void runNextAction() {
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
		runNextAction();
	}

}
