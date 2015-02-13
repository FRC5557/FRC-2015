package com.team5557.code2015.autonomous.programs.square;

import com.team5557.code2015.autonomous.Autonomous;
import com.team5557.code2015.autonomous.programs.actions.AutonomousActionMoveForward;
import com.team5557.code2015.autonomous.programs.actions.AutonomousActionTurnRight;

public class AutonomousSquare extends Autonomous {

	public AutonomousSquare() {
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));
		actions.add(new AutonomousActionMoveForward(100));
		actions.add(new AutonomousActionTurnRight(50));

		current = actions.get(currentId);
	}
}
