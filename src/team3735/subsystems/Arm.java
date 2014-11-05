/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team3735.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import team3735.templates.RobotMap;

/**
 *
 * @author S504652
 */
public class Arm extends Subsystem {

    public void initDefaultCommand() {
    }
    public void armUp()
    {
        RobotMap.armSolenoid.set(Relay.Value.kForward);
    }
    public void armDown()
    {
        RobotMap.armSolenoid.set(Relay.Value.kReverse);
    }
    public void eatBall()
    {
        RobotMap.armMotor.set(-1);
    }
    public void spitBall()
    {
        RobotMap.armMotor.set(1);
    }
    public void stopBall()
    {
        RobotMap.armMotor.set(0);
    }
}
