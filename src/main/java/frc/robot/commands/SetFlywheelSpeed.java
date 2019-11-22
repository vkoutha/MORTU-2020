package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Robot;

import java.util.Collections;
import java.util.Set;

public class SetFlywheelSpeed implements Command {

    private double flywheelSpeed;
    public SetFlywheelSpeed(double speed){
        flywheelSpeed = speed;
    }

    public void execute(){
        Robot.flywheel.setSpeed(flywheelSpeed);
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return Collections.singleton(Robot.flywheel);
    }
}
