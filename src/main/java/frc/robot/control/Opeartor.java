package frc.robot.control;

import edu.wpi.first.wpilibj.Joystick;
import frc.robot.Constants;

public class Opeartor {

    private static Joystick leftJoystick;
    private static Joystick rightJoystick;

    public static void init(){
        leftJoystick = new Joystick(Constants.LEFT_JOYSTICK_PORT);
        rightJoystick = new Joystick(Constants.RIGHT_JOYSTICK_PORT);
    }

    public static Joystick getLeftJoystick(){
        return leftJoystick;
    }

    public static Joystick getRightJoystick() {
        return rightJoystick;
    }

}
