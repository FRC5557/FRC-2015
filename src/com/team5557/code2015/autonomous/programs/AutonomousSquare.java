package com.team5557.code2015.autonomous.programs;

import com.team5557.code2015.autonomous.ActionSet;
import com.team5557.code2015.autonomous.actions.AutonomousActionMoveForward;
import com.team5557.code2015.autonomous.actions.AutonomousActionTurnRight;

public class AutonomousSquare extends ActionSet {

	public AutonomousSquare() {
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));

		currentAction = actions.get(currentActionId);
	}
}
