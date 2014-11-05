
package team3735.templates;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import team3735.commands.intakeBall;
import team3735.commands.releaseBall;
import team3735.commands.shiftDown;
import team3735.commands.shiftUp;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    public static Button pilotOne = new JoystickButton(RobotMap.pilotStick,1);
    public static Button pilotTwo = new JoystickButton(RobotMap.pilotStick,2);
    public static Button pilotThree = new JoystickButton(RobotMap.pilotStick,3);
    public static Button pilotFour = new JoystickButton(RobotMap.pilotStick,4);
    public static Button pilotFive = new JoystickButton(RobotMap.pilotStick,5);
    public static Button pilotSix = new JoystickButton(RobotMap.pilotStick,6);
    public static Button pilotSeven = new JoystickButton(RobotMap.pilotStick,7);
    public static Button pilotEight = new JoystickButton(RobotMap.pilotStick,8);
    public static Button pilotNine = new JoystickButton(RobotMap.pilotStick,9);
    public static Button pilotTen = new JoystickButton(RobotMap.pilotStick,10);
    
    public static Button coPilotOne = new JoystickButton(RobotMap.coPilotStick,1);
    public static Button coPilotTwo = new JoystickButton(RobotMap.coPilotStick,2);
    public static Button coPilotThree = new JoystickButton(RobotMap.coPilotStick,3);
    public static Button coPilotFour = new JoystickButton(RobotMap.coPilotStick,4);
    public static Button coPilotFive = new JoystickButton(RobotMap.coPilotStick,5);
    public static Button coPilotSix = new JoystickButton(RobotMap.coPilotStick,6);
    public static Button coPilotSeven = new JoystickButton(RobotMap.coPilotStick,7);
    public static Button coPilotEight = new JoystickButton(RobotMap.coPilotStick,8);
    public static Button coPilotNine = new JoystickButton(RobotMap.coPilotStick,9);
    public static Button coPilotTen = new JoystickButton(RobotMap.coPilotStick,10);
    public static Button coPilotEleven = new JoystickButton(RobotMap.coPilotStick,11);
    public static Button coPilotTwelve = new JoystickButton(RobotMap.coPilotStick,12);
    
    public OI()
    {
        pilotSeven.whileActive(new shiftDown());
        pilotEight.whileActive(new shiftUp());
        
        coPilotOne.whileHeld(new intakeBall());
        coPilotTwo.whileHeld(new releaseBall()); 
    }
    
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

