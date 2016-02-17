package org.usfirst.frc812.BB9.subsystems;

import org.usfirst.frc812.BB9.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class BallGathererSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private DoubleSolenoid ballGatherer = RobotMap.ballGatherer ;

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void up(){
    	ballGatherer.set(DoubleSolenoid.Value.kForward);
    }
    public void down(){
    	ballGatherer.set(DoubleSolenoid.Value.kReverse);
    }
}

