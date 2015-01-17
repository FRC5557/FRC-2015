# FRC Team 5557 Code for the 2015 Robot/Season
The code is commented as to make it easy to understand

The below text contains information on how the IterativeRobot robot type works

## IterativeRobot Basics
IterativeRobot is one of the types of robot code offered by WPILib - and we chose it because it seemed the simplest to work with in our situation as a rookie team.
The initialization functions are called, as is suggested by the name, before the beginning of every period.
The periodic functions are called approximately every 20 milliseconds - the polling interval between the robot and the driver station.

### What does this mean?
Autonomous programs cannot have simple continuity _(ie. drive forward, turn left, drive back)_.
Everything that is in the periodic function of the autonomous program must take less than 20 msec to run.
This means that we need to program the robot in the style of giving it a list of commands, and then having the periodic
function run each one on each cycle. Using the periodic function allows us to keep our bandwidth down as well, since we
are not overpolling the robot for information.

### Creating an autonomous program
Under the current code structure, it is rather simple to create an autonomous program. Simply create a Java Class inside
the `com.team5557.code2015.autonomous.programs` package and make it implement the `Autonomous` interface. If done correctly
the IDE should automatically suggest to place the unimplemented functions in the code. Below is an example of a good
autonomous program class.

    package com.team5557.code2015.autonomous.programs;
    
    import com.team5557.code2015.RobotDriveController;
    import com.team5557.code2015.autonomous.Autonomous;
    
    public class AutonomousSimpleForward implements Autonomous {
    	
    	private int count = 0;
    	
    	/**
    	 * Simply drives forward for 100 counts ~ 2 seconds
    	 */
    	@Override
    	public void periodic() {
    		if(count < 100) {
    			RobotDriveController.drive().drive(1.0, 0.0);
    		} else {
    			RobotDriveController.drive().drive(0.0, 0.0);
    		}
    		count++;
    	}
    	
    
    }
