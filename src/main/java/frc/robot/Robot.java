package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.control.Operator;
import frc.robot.hardware.IO;
import frc.robot.subsystems.ClawOpener;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Flywheel;

public class Robot extends TimedRobot {

    public static Drivetrain drivetrain;
    public static Flywheel flywheel;
    public static ClawOpener clawOpener;
    @Override
    public void robotInit() {
        IO.init();
        drivetrain = new Drivetrain();
        flywheel = new Flywheel();
        clawOpener = new ClawOpener();
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
        CommandScheduler.getInstance().run();
    }

    @Override
    public void testInit() {

    }

    @Override
    public void testPeriodic() {
     
    }

}