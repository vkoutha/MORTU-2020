package frc.robot.control;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;
import frc.robot.commands.SetFlywheelSpeed;

public class Operator {

    private static Joystick operatorJoystick;

    public static void init(){
        operatorJoystick = new Joystick(Constants.OPERATOR_JOYSTICK_PORT);
        JoystickButton flywheelButton = new JoystickButton(operatorJoystick, Constants.FLYWHEEL_BUTTON_PORT);
        flywheelButton.whileHeld(new SetFlywheelSpeed(Constants.FLYWHEEL_SPEED));
        flywheelButton.whenReleased(new SetFlywheelSpeed(0));
    }

}
