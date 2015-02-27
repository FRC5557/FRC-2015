package com.team5557.code2015.autonomous.programs;

import com.team5557.code2015.autonomous.ActionSet;
import com.team5557.code2015.autonomous.actions.AutonomousActionMoveForward;

public class AutonomousForward extends ActionSet {

	public AutonomousForward() {
		actions.add(new AutonomousActionMoveForward(150));
		actions.add(new AutonomousActionMoveForward(50));

		currentAction = actions.get(currentActionId);
	}

}
