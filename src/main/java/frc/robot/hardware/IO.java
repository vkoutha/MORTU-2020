package frc.robot.hardware;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants;

public class IO {

    private static TalonSRX flywheelMasterTalon;
    private static TalonSRX flywheelFollowerTalon;

    public static void init(){
        flywheelMasterTalon = new TalonSRX(Constants.MASTER_FLYWHEEL_TALON_PORT);
        flywheelFollowerTalon = new TalonSRX(Constants.FOLLOWER_FLYWHEEL_TALON_PORT);
        flywheelFollowerTalon.set(ControlMode.Follower, Constants.MASTER_FLYWHEEL_TALON_PORT);
    }

    public static TalonSRX getFlywheelMasterTalon(){
        return flywheelMasterTalon;
    }

}
