package com.team5557.code2015.actions;

import java.util.ArrayList;

public abstract class ActionSet {

	public ArrayList<Action> actions;
	public Action currentAction;
	public int currentActionId;

	public ActionSet() {
		actions = new ArrayList<Action>();
	}

	public void addAction(Action action) {
		actions.add(action);
	}

	public Action getCurrentAction() {
		return currentAction;
	}

	public void runNextAction() {
		currentAction.run();
		if (currentAction.isSatisfied()) {
			if (actions.size() > currentActionId) {
				currentAction = actions.get(currentActionId + 1);
				currentActionId++;
			}
		}
	}

}
