package frc.robot.hardware;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import frc.robot.Constants;

public class IO {

    private static CANSparkMax leftSparkMaster;
    private static CANSparkMax leftSparkSlave;
    private static CANSparkMax rightSparkMaster;
    private static CANSparkMax rightSparkSlave;
    private static TalonSRX flywheelMasterTalon;
    private static TalonSRX flywheelFollowerTalon;
    private static Compressor compressor;
    private static DoubleSolenoid clawOpenerPiston;

    public static void init(){
        leftSparkMaster = new CANSparkMax(Constants.LEFT_SPARK_MASTER_PORT, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftSparkSlave = new CANSparkMax(Constants.LEFT_SPARK_FOLLOWER_PORT, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightSparkMaster = new CANSparkMax(Constants.RIGHT_SPARK_MASTER_PORT, CANSparkMaxLowLevel.MotorType.kBrushless);
        rightSparkSlave = new CANSparkMax(Constants.RIGHT_SPARK_FOLLOWER_PORT, CANSparkMaxLowLevel.MotorType.kBrushless);
        leftSparkMaster.setInverted(true);
        leftSparkSlave.follow(leftSparkMaster);
        rightSparkSlave.follow(rightSparkMaster);
        flywheelMasterTalon = new TalonSRX(Constants.MASTER_FLYWHEEL_TALON_PORT);
        flywheelFollowerTalon = new TalonSRX(Constants.FOLLOWER_FLYWHEEL_TALON_PORT);
        flywheelFollowerTalon.set(ControlMode.Follower, Constants.MASTER_FLYWHEEL_TALON_PORT);
        compressor = new Compressor(Constants.PCM_PORT);
        clawOpenerPiston = new DoubleSolenoid(Constants.PCM_PORT,
                Constants.CLAW_OPENER_FORWARD_CHANNEL, Constants.CLAW_OPENER_REVERSE_CHANNEL);
        compressor.start();
    }

    public static CANSparkMax getLeftSparkMaster(){return leftSparkMaster;}

    public static CANSparkMax getRightSparkMaster(){return rightSparkMaster;}

    public static TalonSRX getFlywheelMasterTalon(){
        return flywheelMasterTalon;
    }

    public static DoubleSolenoid getClawOpenerPiston(){return clawOpenerPiston;}

}
