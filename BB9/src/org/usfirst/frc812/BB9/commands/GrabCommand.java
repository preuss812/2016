package org.usfirst.frc812.BB9.commands;

import org.usfirst.frc812.BB9.Robot;
import org.usfirst.frc812.BB9.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;

public class GrabCommand extends Command {

	private Boolean open = true;
	
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		if(Robot.grabberSubsystem.getGrabberState() == DoubleSolenoid.Value.kOff) {
			Robot.grabberSubsystem.openGrabber();
			open = true;
		}
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if (open) {
			open = false;
			System.out.println("Grabber is Open and now Closing");
			Robot.grabberSubsystem.closeGrabber();
		} else {
			open = true;
			System.out.println("Grabber is Closed and now Opening");

			Robot.grabberSubsystem.openGrabber();
		}
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
