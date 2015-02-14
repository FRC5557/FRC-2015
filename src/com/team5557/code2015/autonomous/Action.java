package com.team5557.code2015.autonomous;

/**
 * Abstract Action class to superclass various type of periodic actions
 */
public abstract class Action {

	public boolean satisfied;

	public Action() {
		satisfied = false;
	}

	/**
	 * Method that is called from the action controller Checks whether action is
	 * satisfied, and if not, runs it
	 */
	public void run() {
		if (!isSatisfied()) {
			periodic();
			checkSatisfaction();
		}
	}

	/**
	 * Method that needs to be implemented in the subclass Runs every 20 msec
	 */
	protected abstract void periodic();

	/**
	 * Method that needs to be implemented in the subclass, checks and sets
	 * satisfaction variable
	 */
	protected abstract void checkSatisfaction();

	public boolean isSatisfied() {
		return satisfied;
	}

	public void setSatisfied(boolean satisfaction) {
		satisfied = satisfaction;
	}

}
