/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author S504652
 */
public class Arm extends Subsystem {

    public void initDefaultCommand() {
    }
    public void armUp()
    {
        RobotMap.armSolenoid.set(true);
    }
    public void armDown()
    {
        RobotMap.armSolenoid.set(false);
    }
    public void eatBall()
    {
        RobotMap.armMotor.set(-1);
    }
    public void spitBall()
    {
        RobotMap.armMotor.set(1);
    }
}
