package org.usfirst.frc3244.MechanicalMayham.util;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.buttons.Button;

/**
 *
 * @author Ken Streeter
 */
public class DisabledOnlyJoystickButton extends Button {

    private GenericHID joystick;
    private int buttonNumber;
    private DriverStation ds;

    public DisabledOnlyJoystickButton(GenericHID joystick, int buttonNumber) {
        this.joystick = joystick;
        this.buttonNumber = buttonNumber;
        ds = DriverStation.getInstance();
    }

    public boolean get() {
        return joystick.getRawButton(buttonNumber) && ds.isDisabled();
    }
}
