package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.hardware.IO;

public class Flywheel implements Subsystem {
    
    public void setSpeed(double speed){
        IO.getFlywheelMasterTalon().set(ControlMode.PercentOutput, speed);
    }

}
