package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.HardwareStates;
import frc.robot.hardware.IO;

public class ClawOpener implements Subsystem {

    public void actuatePiston(HardwareStates.PistonStates state){
        if(state == HardwareStates.PistonStates.IN){
            IO.getClawOpenerPiston().set(DoubleSolenoid.Value.kReverse);
        }else if(state == HardwareStates.PistonStates.OUT){
            IO.getClawOpenerPiston().set(DoubleSolenoid.Value.kForward);
        }
    }

}
