package org.usfirst.frc812.BB9.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CameraFrontBack extends CommandGroup {
	private boolean facingBack = true;
    
    public  CameraFrontBack() {
        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.
    	if( facingBack ) {
    		addSequential(new CameraLeft());
    		addSequential(new CameraLeftLevel());
    		facingBack = false;
    	}
    	else
    	{
    		addSequential(new CameraRight());
    		addSequential(new CameraRightLevel());
    		facingBack = true;
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
}
