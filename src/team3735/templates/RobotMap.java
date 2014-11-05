package team3735.templates;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Relay;
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
        static final int LEFTMOTOR_PORT = 1;
        static final int RIGHTMOTOR_PORT = 2;
        static final int ARMMOTOR_PORT = 3;
    //DIGITAL PORTS
        static final int PRESSURESWITCH_PORT = 1;
        
    //RELAY PORTS
        static final int COMPRESSORSPIKE_PORT = 1;
        static final int SHIFTERSOLENOID_PORT = 1;
        static final int ARMSOLENOID_PORT = 2;
        
//PORTS ON CRIO
        
//COMPONENTS ON DRIVER STATION LAPTOP
    public static Joystick pilotStick = new Joystick(PILOTSTICK_PORT);     //Saitek P880
    public static Joystick coPilotStick = new Joystick(COPILOTSTICK_PORT); //Logitech F310
    
//COMPONENTS ON ROBOT
    public static Talon LeftMotors = new Talon(LEFTMOTOR_PORT);   
    public static Talon RightMotors = new Talon(RIGHTMOTOR_PORT); 
    public static Talon armMotor = new Talon(ARMMOTOR_PORT);   
    
    public static Compressor compressor = new Compressor(PRESSURESWITCH_PORT,COMPRESSORSPIKE_PORT);
    
    public static Relay armSolenoid = new Relay(ARMSOLENOID_PORT);
    public static Relay shifterSolenoid = new Relay(SHIFTERSOLENOID_PORT);
    }
