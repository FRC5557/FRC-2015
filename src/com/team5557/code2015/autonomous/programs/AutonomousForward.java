package com.team5557.code2015.autonomous.programs;

import com.team5557.code2015.autonomous.ActionSet;
import com.team5557.code2015.autonomous.actions.AutonomousActionMoveForward;

public class AutonomousForward extends ActionSet {
	
	public AutonomousForward() {
		actions.add(new AutonomousActionMoveForward(200));
		
		currentAction = actions.get(currentActionId);
	}

}
