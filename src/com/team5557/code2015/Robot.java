package com.team5557.code2015;

import com.team5557.code2015.autonomous.Autonomous;
import com.team5557.code2015.autonomous.AutonomousOne;

import edu.wpi.first.wpilibj.SampleRobot;
import edu.wpi.first.wpilibj.Timer;

public class Robot extends SampleRobot {

	public void autonomous() {
		Autonomous auto = new AutonomousOne();
		long startTime = System.nanoTime();
		while(isAutonomous() && isEnabled() && (System.nanoTime() <= (startTime + auto.getTime()))) {
			auto.run();
		}
		auto.stop();
	}

	public void operatorControl() {
		while(isAutonomous() && isEnabled()) {
			RobotDriveController.drive().arcadeDrive(RobotJoystickController.joystick());
			Timer.delay(.05);
		}
	}

}
