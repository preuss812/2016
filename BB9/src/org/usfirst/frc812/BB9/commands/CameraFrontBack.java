package org.usfirst.frc812.BB9.commands;

import org.usfirst.frc812.BB9.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CameraFrontBack extends CommandGroup {
    private boolean started = false;
    
    public boolean isRunning() {
    	return started;
    }

    public void cancel() {
   		Robot.cameraControl.left();
    	Robot.cameraControl.levelLeftTrim();
   		started = false;
    }
    public void start() {
   		Robot.cameraControl.right();
    	Robot.cameraControl.levelRightTrim();
       	started = true;
    }		
        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
}
