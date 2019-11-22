package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import frc.robot.control.Operator;
import frc.robot.hardware.IO;
import frc.robot.subsystems.Flywheel;

public class Robot extends TimedRobot {

    public static Flywheel flywheel;
    @Override
    public void robotInit() {
        IO.init();
        flywheel = new Flywheel();
        Operator.init();
    }

    @Override
    public void disabledInit() {
      
    }

    @Override
    public void disabledPeriodic() {
      
    }

    @Override
    public void teleopInit() {
    
    }

    @Override
    public void teleopPeriodic() {
       
    }

    @Override
    public void autonomousInit() {
        
    }

    @Override
    public void autonomousPeriodic() {

    }

    @Override
    public void testInit() {

    }

    @Override
    public void testPeriodic() {
     
    }
}