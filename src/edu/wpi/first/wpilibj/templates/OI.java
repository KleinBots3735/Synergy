
package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static JoystickButton pilotOne = new JoystickButton(RobotMap.pilotStick,1);
    public static JoystickButton pilotTwo = new JoystickButton(RobotMap.pilotStick,2);
    public static JoystickButton pilotThree = new JoystickButton(RobotMap.pilotStick,3);
    public static JoystickButton pilotFour = new JoystickButton(RobotMap.pilotStick,4);
    public static JoystickButton pilotFive = new JoystickButton(RobotMap.pilotStick,5);
    public static JoystickButton pilotSix = new JoystickButton(RobotMap.pilotStick,6);
    public static JoystickButton pilotSeven = new JoystickButton(RobotMap.pilotStick,7);
    public static JoystickButton pilotEight = new JoystickButton(RobotMap.pilotStick,8);
    public static JoystickButton pilotNine = new JoystickButton(RobotMap.pilotStick,9);
    public static JoystickButton pilotTen = new JoystickButton(RobotMap.pilotStick,10);
    
    public static JoystickButton coPilotOne = new JoystickButton(RobotMap.coPilotStick,1);
    public static JoystickButton coPilotTwo = new JoystickButton(RobotMap.coPilotStick,2);
    public static JoystickButton coPilotThree = new JoystickButton(RobotMap.coPilotStick,3);
    public static JoystickButton coPilotFour = new JoystickButton(RobotMap.coPilotStick,4);
    public static JoystickButton coPilotFive = new JoystickButton(RobotMap.coPilotStick,5);
    public static JoystickButton coPilotSix = new JoystickButton(RobotMap.coPilotStick,6);
    public static JoystickButton coPilotSeven = new JoystickButton(RobotMap.coPilotStick,7);
    public static JoystickButton coPilotEight = new JoystickButton(RobotMap.coPilotStick,8);
    public static JoystickButton coPilotNine = new JoystickButton(RobotMap.coPilotStick,9);
    public static JoystickButton coPilotTen = new JoystickButton(RobotMap.coPilotStick,10);
    public static JoystickButton coPilotEleven = new JoystickButton(RobotMap.coPilotStick,11);
    public static JoystickButton coPilotTwelve = new JoystickButton(RobotMap.coPilotStick,12);
    
    public static double getPilotStickX()
    {
        return RobotMap.pilotStick.getX();
    }
    public static double getPilotStickY()
    {
        return RobotMap.pilotStick.getY();
    }
    public static double getPilotStickZ()
    {
        return RobotMap.pilotStick.getZ();
    }
}

