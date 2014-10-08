/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author S504652
 */
public class Drivetrain extends Subsystem {
    public static RobotDrive drive = new RobotDrive(RobotMap.frontLeftMotor,RobotMap.rearLeftMotor,RobotMap.frontRightMotor,RobotMap.rearRightMotor);
    
    public void initDefaultCommand() {
    }
    public static void move(double y, double x)
    {
        drive.arcadeDrive(y,x);
    }
    public static void shiftUp()
    {
        RobotMap.shifterSolenoid.set(true);
    }
    public static void shiftDown()
    {
        RobotMap.shifterSolenoid.set(false);
    }
    public static double getLeftEncoder()
    {
        return RobotMap.leftEncoder.get();
    }
    public static void startLeftEncoder()
    {
        RobotMap.leftEncoder.start();
    }
    public static void stopLeftEncoder()
    {
        RobotMap.leftEncoder.stop();
    }
    public static void resetLeftEncoder()
    {
        RobotMap.leftEncoder.reset();
    }
    public static double getRightEncoder()
    {
        return RobotMap.rightEncoder.get();
    }
    public static void startRightEncoder()
    {
        RobotMap.rightEncoder.start();
    }
    public static void stopRightEncoder()
    {
        RobotMap.rightEncoder.stop();
    }
    public static void resetRightEncoder()
    {
        RobotMap.rightEncoder.reset();
    }
}
