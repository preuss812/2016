package org.usfirst.frc812.BB9.subsystems;

import org.usfirst.frc812.BB9.RobotMap;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GrabberSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	 DoubleSolenoid grabber = RobotMap.grabber;
	
	 public DoubleSolenoid.Value getGrabberState() {
		 DoubleSolenoid.Value value = grabber.get();
		 switch (value) {
	      case kOff:
	    	  System.out.println("grabber is OFF");
	        break;
	      case kForward:
	    	  System.out.println("grabber is Forward");
	        break;
	      case kReverse:
	    	  System.out.println("grabber is Reverse");
	        break;
	    }
		 return value;
	 }
	 
    public void closeGrabber() {
    	grabber.set(DoubleSolenoid.Value.kReverse);
    	System.out.println("closeGrabber");
    }

    public void openGrabber() {
    	grabber.set(DoubleSolenoid.Value.kForward);
    	System.out.println("openGrabber");
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

