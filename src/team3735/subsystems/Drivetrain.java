/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import team3735.templates.RobotMap;

/**
 *
 * @author S504652
 */
public class Drivetrain extends Subsystem {
    public static RobotDrive drive = new RobotDrive(RobotMap.LeftMotors,RobotMap.RightMotors);
    
    public void initDefaultCommand() {
    }
    public static void move(double y, double x)
    {
        drive.arcadeDrive(y,x);
    }
    public static void highGear()
    {
        RobotMap.shifterSolenoid.set(Relay.Value.kForward);
    }
    public static void lowGear()
    {
        RobotMap.shifterSolenoid.set(Relay.Value.kReverse);
    }
}
