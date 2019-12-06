package frc.robot.subsystems;

import com.revrobotics.ControlType;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.commands.JoystickDrive;
import frc.robot.hardware.IO;

public class Drivetrain implements Subsystem {

    public Drivetrain(){
        setDefaultCommand(new JoystickDrive());
    }

    public void setLeftSpeed(double speed){
        IO.getLeftSparkMaster().set(speed);

        IO.getLeftSparkMaster().getPIDController().setReference(10000, ControlType.kSmartVelocity);
    }

    public void setRightSpeed(double speed){
        IO.getRightSparkMaster().set(speed);
    }

    public void stop(){
        setLeftSpeed(0);
        setRightSpeed(0);
    }

}
