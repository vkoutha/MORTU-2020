/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;
import frc.robot.control.Operator;
import frc.robot.hardware.IO;
import frc.robot.subsystems.Drivetrain;

public class Robot extends TimedRobot {

    public static Drivetrain drivetrain;
    @Override
    public void robotInit() {
        IO.init();
        drivetrain = new Drivetrain();
        Operator.init();
    }

    @Override
    public void robotPeriodic() {

    }

    @Override
    public void disabledInit() {
    }

    @Override
    public void disabledPeriodic() {
    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void autonomousPeriodic() {
    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void teleopPeriodic() {
        CommandScheduler.getInstance().run();
    }

    @Override
    public void testInit() {

    }

    @Override
    public void testPeriodic() {
    }
}
