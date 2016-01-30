package org.usfirst.frc812.BB9.subsystems;

import org.usfirst.frc812.BB9.RobotMap;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CameraControl extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Servo horizontal = RobotMap.cameraHorizontal;
	Servo vertical = RobotMap.cameraVertical;
	
	public void center() {
		horizontal.setAngle(90.0);
	}
	
	public void left() {
		this.center();
		horizontal.setAngle(0.0);
	}
	public void right() {
		this.center();
		horizontal.setAngle(180.0);
	}
	
	public void level(){
		vertical.setAngle(90.0);
	}
	public void up(){
		this.level();
		vertical.setAngle(180.0);
	}
	public void down(){
		this.level();
		vertical.setAngle(0.0);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

