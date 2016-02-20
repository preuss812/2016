package org.usfirst.frc812.BB9.subsystems;

import org.usfirst.frc812.BB9.Robot;
import org.usfirst.frc812.BB9.RobotMap;
import org.usfirst.frc812.BB9.commands.CameraVerticalContinuousCommand;

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
	
	public void levelLeftTrim(){
		vertical.setAngle(getVerticalLeftJoystick());
	}
	public void up(){
		this.levelLeftTrim();
		vertical.setAngle(180.0);
	}
	public void down(){
		this.levelLeftTrim();
		vertical.setAngle(0.0);
	}
	
	public void levelRightTrim() {
		vertical.setAngle(getVerticalRightJoystick());
	}
	
	public double getVerticalLeftJoystick(){
		return (Robot.oi.leftJoystick.getRawAxis(2) +1)*90;
	}
	
	public double getVerticalRightJoystick(){
		return (Robot.oi.rightJoystick.getRawAxis(2) +1)*90;
	}
	
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new CameraVerticalContinuousCommand());
    }
}

