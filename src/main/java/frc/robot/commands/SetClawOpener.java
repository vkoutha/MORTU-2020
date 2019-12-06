package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.HardwareStates;
import frc.robot.Robot;

import java.util.Collections;
import java.util.Set;

public class SetClawOpener implements Command {

    private HardwareStates.PistonStates pistonState;
    public SetClawOpener(HardwareStates.PistonStates state){
        pistonState = state;
    }

    public void execute(){
        Robot.clawOpener.actuatePiston(pistonState);
    }

    public boolean isFinished(){
        return true;
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return Collections.singleton(Robot.clawOpener);
    }
}
