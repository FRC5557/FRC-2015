package com.team5557.code2015.actions;

public abstract class Action {

	public boolean satisfied;

	public Action() {
		satisfied = false;
	}

	public void run() {
		if (!isSatisfied()) {
			periodic();
		}
	}

	private void periodic() {
	}

	public boolean isSatisfied() {
		return satisfied;
	}

	public void setSatisfied(boolean satisfaction) {
		satisfied = satisfaction;
	}

}
