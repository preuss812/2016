package org.usfirst.frc812.BB9.subsystems;

import org.usfirst.frc812.BB9.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ControlBoxSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	Joystick cb = RobotMap.controlBox;
			
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }

    public int readBits() {
    	int flagBits = 0;
    	for (int i = 1; i<=7; i++) {
    		if(cb.getRawButton(i)) {
    			flagBits = flagBits | 1 << i;
    			System.out.println("bit: " + i + " true");
    		}
    	}
    	return flagBits;
    }
    public void printBits() {
    	int bits;
    	bits = readBits();
    	System.out.println("ControlBox bits: " + Integer.toBinaryString(bits));
    }

}

