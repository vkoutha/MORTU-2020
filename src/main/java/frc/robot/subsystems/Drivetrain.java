package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.commands.JoystickDrive;
import frc.robot.hardware.IO;

public class Drivetrain implements Subsystem {

    public Drivetrain(){
        setDefaultCommand(new JoystickDrive());
    }

    public void setLeftMotorSpeed(double speed){
        IO.getLeftTalon().set(ControlMode.PercentOutput, speed);
    }

    public void setRightMotorSpeed(double speed){
        IO.getRightTalon().set(ControlMode.PercentOutput, speed);
    }

}
