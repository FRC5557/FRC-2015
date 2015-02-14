package com.team5557.code2015.autonomous;

import java.util.ArrayList;

/**
 * Class made primarily for Autonomous programs Contains a set of actions that
 * will be run until there are no more left
 */
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

	/**
	 * Checks if action is satisfied, if it is, then runs the next one if there
	 * is one in the arraylist
	 */
	public void runActions() {
		currentAction.run();
		if (currentAction.isSatisfied()) {
			if (actions.size() > currentActionId) {
				currentAction = actions.get(currentActionId + 1);
				currentActionId++;
			}
		}
	}

}
