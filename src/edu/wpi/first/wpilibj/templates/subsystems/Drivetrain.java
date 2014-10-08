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
        RobotMap.shifter.set(true);
    }
    public static void shiftDown()
    {
        RobotMap.shifter.set(false);
    }
}
