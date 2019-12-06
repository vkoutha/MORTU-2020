package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Robot;
import frc.robot.control.Operator;

import java.util.Collections;
import java.util.Set;

public class JoystickDrive implements Command {

    @Override
    public Set<Subsystem> getRequirements() {
        return Collections.singleton(Robot.drivetrain);
    }

    public void execute(){
        Robot.drivetrain.setLeftSpeed(Operator.getLeftJoystick().getY());
        Robot.drivetrain.setRightSpeed(Operator.getRightJoystick().getY());
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        Robot.drivetrain.stop();
    }
}
