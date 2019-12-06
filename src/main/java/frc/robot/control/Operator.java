package frc.robot.control;


import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;
import frc.robot.HardwareStates;
import frc.robot.commands.SetClawOpener;
import frc.robot.commands.SetFlywheelSpeed;

public class Operator {

    private static Joystick leftJoystick;
    private static Joystick rightJoystick;
    private static Joystick operatorJoystick;

    public static void init(){
        operatorJoystick = new Joystick(Constants.OPERATOR_JOYSTICK_PORT);
        JoystickButton flywheelButton = new JoystickButton(operatorJoystick, Constants.FLYWHEEL_BUTTON_PORT);
        flywheelButton.whileHeld(new SetFlywheelSpeed(Constants.FLYWHEEL_SPEED));
        flywheelButton.whenReleased(new SetFlywheelSpeed(0));
        JoystickButton openPistonButton = new JoystickButton(operatorJoystick, Constants.OPEN_CLAW_BUTTON_PORT);
        JoystickButton closePistonButton = new JoystickButton(operatorJoystick, Constants.CLOSE_CLAW_BUTTON_PORT);
        openPistonButton.whenPressed(new SetClawOpener(HardwareStates.PistonStates.OUT));
        closePistonButton.whenPressed(new SetClawOpener(HardwareStates.PistonStates.IN));
    }

    public static Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public static Joystick getRightJoystick() {
        return rightJoystick;
    }
}
