package frc.robot.hardware;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;

public class IO {

    private static TalonSRX leftTalon;
    private static TalonSRX rightTalon;

    public static void init(){
        leftTalon = new TalonSRX(Constants.LEFT_TALON_PORT);
        rightTalon = new TalonSRX(Constants.RIGHT_TALON_PORT);
    }

    public static TalonSRX getLeftTalon(){
        return leftTalon;
    }

    public static TalonSRX getRightTalon(){
        return rightTalon;
    }

}
