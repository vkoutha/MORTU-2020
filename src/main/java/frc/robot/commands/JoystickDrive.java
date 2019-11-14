package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Robot;
import frc.robot.control.Opeartor;

import java.util.Collections;
import java.util.Set;
import java.util.function.BinaryOperator;

public class JoystickDrive implements Command {

    public void execute(){
        Robot.drivetrain.setLeftMotorSpeed(Opeartor.getLeftJoystick().getY());
        Robot.drivetrain.setRightMotorSpeed(Opeartor.getRightJoystick().getY());
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return Collections.singleton(Robot.drivetrain);
    }

}
