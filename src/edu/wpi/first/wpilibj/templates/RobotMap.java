package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    
//PORT MAP
//PORTS ON DRIVER STATION LAPTOP
    static final int PILOTSTICK_PORT = 1; //P880 Controller
    static final int COPILOTSTICK_PORT = 2;    //Logitech Controller
//PORTS ON DIGITAL SIDECAR
    //PWM PORTS
        static final int FRONTLEFTMOTOR_PORT = 1;
        static final int FRONTRIGHTMOTOR_PORT = 2;
        static final int REARLEFTMOTOR_PORT = 3;
        static final int REARRIGHTMOTOR_PORT = 4;
        static final int ARMMOTOR_PORT = 5;
    //DIGITAL PORTS
        static final int PRESSURESWITCH_PORT = 1;
    //RELAY PORTS
        static final int COMPRESSORSPIKE_PORT = 1;
        
//PORTS ON CRIO
    //ANALOG PORTS (BREAKOUT #1)
    //SOLENOID PORTS (BREAKOUT #3)
        static final int SHIFTERSOLENOID_PORT = 1;
        static final int ARMSOLENOID_PORT = 2;

        
//COMPONENTS ON DRIVER STATION LAPTOP
    public static Joystick pilotStick = new Joystick(PILOTSTICK_PORT);
    public static Joystick coPilotStick = new Joystick(COPILOTSTICK_PORT);
    
//COMPONENTS ON ROBOT
    public static Talon frontLeftMotor = new Talon(FRONTLEFTMOTOR_PORT);   //PWM #1
    public static Talon frontRightMotor = new Talon(FRONTRIGHTMOTOR_PORT);  //PWM #2
    public static Talon rearLeftMotor = new Talon(REARLEFTMOTOR_PORT);    //PWM #3
    public static Talon rearRightMotor = new Talon(REARRIGHTMOTOR_PORT);   //PWM #4
    public static Talon armMotor = new Talon(ARMMOTOR_PORT);   //PWM #4
    
    public static Compressor compressor = new Compressor(PRESSURESWITCH_PORT,COMPRESSORSPIKE_PORT);
    
    public static Solenoid arm = new Solenoid(ARMSOLENOID_PORT);
    public static Solenoid shifter = new Solenoid(SHIFTERSOLENOID_PORT);
}
