package org.usfirst.frc812.BB9.subsystems;

import org.usfirst.frc812.BB9.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GathererMotorSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void forward() {
    	RobotMap.gathererMotor.set(0.5);
    }
    public void reverse() {
    	RobotMap.gathererMotor.set(-0.5);
    }
    public void stop() {
    	RobotMap.gathererMotor.set(0.0);
    }
    
}