// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc3244.MechanicalMayham;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc3244.MechanicalMayham.commands.*;
import org.usfirst.frc3244.MechanicalMayham.subsystems.*;
import org.usfirst.frc3244.MechanicalMayham.util.AndJoystickButton;
import org.usfirst.frc3244.MechanicalMayham.util.AndNOTJoystickButton2;
import org.usfirst.frc3244.MechanicalMayham.util.IOButtonOrButton;
import org.usfirst.frc3244.MechanicalMayham.util.JoystickAxisButton;
import org.usfirst.frc3244.MechanicalMayham.util.JoystickPOVButton;
import org.usfirst.frc3244.MechanicalMayham.util.OrAxisTriggerButton;
import org.usfirst.frc3244.MechanicalMayham.util.OrJoystickButton;
import org.usfirst.frc3244.MechanicalMayham.util.Utils;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.InternalButton;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public Joystick xBox_Driver;
    public Joystick xBox_CoDriver;
    public Joystick launchPad;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
   
    //Robot IO Buttons
    public IOButtonOrButton RobotIO_climb;
    
    //Xbox game pad Channels
    public static final int GAMEPAD_XBOX_LEFT_X_AXIS = 0;//
    public static final int GAMEPAD_XBOX_LEFT_Y_AXIS = 1;//
	public static final int GAMEPAD_XBOX_LEFT_TRIGGER = 2;//
	public static final int GAMEPAD_XBOX_RIGHT_TRIGGER = 3;//
	public static final int GAMEPAD_XBOX_RIGHT_X_AXIS = 4;//
	public static final int GAMEPAD_XBOX_RIGHT_Y_AXIS = 5;//

	public static final int GAMEPAD_XBOX_A_BUTTON = 1;//
	public static final int GAMEPAD_XBOX_B_BUTTON = 2;//
	public static final int GAMEPAD_XBOX_X_BUTTON = 3;//
	public static final int GAMEPAD_XBOX_Y_BUTTON = 4;//
	public static final int GAMEPAD_XBOX_LEFT_BUTTON = 5;//
	public static final int GAMEPAD_XBOX_RIGHT_BUTTON = 6;//
	public static final int GAMEPAD_XBOX_RESET_BUTTON = 7;//
	public static final int GAMEPAD_XBOX_START_BUTTON = 8;//
	public static final int GAMEPAD_XBOX_LEFT_STICK_BUTTON = 9;
	public static final int GAMEPAD_XBOX_RIGHT_STICK_BUTTON = 10;
	
   public JoystickButton a_xBox_Driver;
   public JoystickButton b_xBox_Driver;
   public JoystickButton x_xBox_Driver;
   public JoystickButton y_xBox_Driver;
   public JoystickButton lb_xBox_Driver;
   public JoystickButton rb_xBox_Driver;
   public JoystickButton start_xBox_Driver;
   public JoystickButton reset_xBox_Driver;
   
   public JoystickAxisButton rt_xBox_Driver;
   
   public JoystickPOVButton povNorth_xBox_Driver;
   public JoystickPOVButton povSouth_xBox_Driver;
   public JoystickPOVButton povWest_xBox_Driver;
   public JoystickPOVButton povEast_xBox_Driver;
  
   
   public Joystick xbox_xBox_CoDriver;
   public JoystickButton a_xBox_CoDriver;
   public JoystickButton b_xBox_CoDriver;
   public JoystickButton x_xBox_CoDriver;
   public JoystickButton y_xBox_CoDriver;
   public JoystickButton lb_xBox_CoDriver;
   public JoystickButton rb_xBox_CoDriver;
   public AndNOTJoystickButton2 start_xBox_CoDriver;
   public JoystickButton reset_xBox_CoDriver;
   
   public JoystickAxisButton rt_xBox_CoDriver;
   
   public JoystickButton btn1_launchPad;
   public JoystickButton btn2_launchPad;
   public JoystickButton btn3_launchPad;
   public JoystickButton btn4_launchPad;
   public JoystickButton btn5_launchPad;
   public JoystickButton btn6_launchPad;
   public JoystickButton btn7_launchPad;
   public JoystickButton btn8_launchPad;
   public JoystickButton btn9_launchPad;
   public JoystickButton btn10_launchPad;
   public JoystickButton btn11_launchPad;
 
   
   //InternalButtons
   public InternalButton example;
   
   //Special button combo
   //public OrAxisTriggerButton intake_FWD_Axis_OR;
   public OrJoystickButton intake_FWD_OR;
   public OrJoystickButton winch_Climb_OR;
   public OrJoystickButton wrist_Up_OR;
   public OrJoystickButton wrist_Present_OR;
   public OrJoystickButton wrist_Down_OR;
   public OrJoystickButton intake_REV_OR;
   public OrJoystickButton fuel_Deliver_OR;

    public OI() {
    	setUp_Controler_xBox_Driver();
    	setUp_Controler_xBox_CoDriver();
    	setUp_Controler_LaunchPad();
    	setUp_SmartDashboard_Buttons();
    	setUp_OR_Buttons(); //Do this after all joy sticks are declared. 
    	
    	
    }
    
    private void setUp_Controler_xBox_Driver(){
    	xBox_Driver = new Joystick(0);
        
        povNorth_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.NORTH);
        povNorth_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,0.0f));		//DriveTurnToHeaddingInTeleop());
        
        povSouth_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.SOUTH);
        povSouth_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,179.9f));	//DriveTurnToHeaddingInTeleop());
        
        povWest_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.WEST);
        povWest_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,-90.0f));		//DriveTurnToHeaddingInTeleop());
        
        povEast_xBox_Driver = new JoystickPOVButton(xBox_Driver, JoystickPOVButton.EAST);
        povEast_xBox_Driver.whileHeld(new Drive_Turn_To_Setpoint_InTeleop(0.0,0.0,90.0f));		//DriveTurnToHeaddingInTeleop());
    }
    
    private void setUp_Controler_xBox_CoDriver(){
    	xBox_CoDriver = new Joystick(1);
    	
    
    }
    
    private void setUp_Controler_LaunchPad(){
    	launchPad = new Joystick(2);
        
    	
    }
    
    private void setUp_SmartDashboard_Buttons(){
    	example = new InternalButton();
    	//example.whileHeld(new CMD());
    	
    }
    
    private void setUp_OR_Buttons(){
    	
    	//Update We split the Co driver and Driver functions They act and Driver = Vision Track Boiler, Co Driver uses Delay indexer and No Vision.
    	//fuel_Deliver_OR = new OrJoystickButton(xBox_Driver, GAMEPAD_XBOX_START_BUTTON, xBox_CoDriver, GAMEPAD_XBOX_START_BUTTON);
    	//Open loop
    	//fuel_Deliver_OR.whileHeld(new FlyWheel_Run_ToPot());
    	//Use PID Boiler Tracking
    	//fuel_Deliver_OR.whileHeld(new CG_FireFuel_WithVision());
    			
    	//intake_FWD_Axis_OR = new OrAxisTriggerButton(rt_xBox_CoDriver, launchPad, 5);
    	//intake_FWD_Axis_OR.whileHeld(new IntakeFuel(Robot.fuelIntake.INTAKESPEED));
    	intake_FWD_OR = new OrJoystickButton(xBox_CoDriver, GAMEPAD_XBOX_RIGHT_BUTTON, launchPad, 5); //Right Trigger not going to work
    	//intake_FWD_OR.whileHeld(new IntakeFuel(Robot.fuelIntake.INTAKESPEED));
    	
    	//intake_REV_OR = new OrJoystickButton(xBox_CoDriver, GAMEPAD_XBOX_RIGHT_BUTTON, launchPad, 6);
    	//intake_REV_OR.whileHeld(new IntakeFuel(-Robot.fuelIntake.INTAKESPEED));
    			
    	
    	winch_Climb_OR = new OrJoystickButton(xBox_CoDriver, GAMEPAD_XBOX_LEFT_BUTTON, launchPad, 2);
    	//winch_Climb_OR.whileHeld(new Winch_Jog_Fast(Robot.winch.CLIMB_SPEED));
    	
    	wrist_Up_OR = new OrJoystickButton(xBox_CoDriver, GAMEPAD_XBOX_Y_BUTTON, launchPad, 7);
    	//wrist_Up_OR.whenPressed(new Wrist_to_Setpoint(Robot.wrist.UP));
    	
    	wrist_Present_OR = new OrJoystickButton(xBox_CoDriver, GAMEPAD_XBOX_B_BUTTON, launchPad, 8);
    	//wrist_Present_OR.whenPressed(new Wrist_to_Setpoint(Robot.wrist.PRESENT_GEAR_ON_PEG));
    	
    	wrist_Down_OR = new OrJoystickButton(xBox_CoDriver, GAMEPAD_XBOX_A_BUTTON, launchPad, 9);
    	//wrist_Down_OR.whenPressed(new Wrist_to_Setpoint(Robot.wrist.DOWN));
    }
    
    
    private double stickClamp(double value, double min, double max){
    	if(value>max){
    		return max;
    	}else if(value < min){
    		return min;
    	}else{
    		return value;
    	}
    }
    private double stickDeadBand(double value, double deadband){
    	if(Math.abs(value)<deadband){
    		return 0;
    	}else{
    		return value;
    	}
    }
    public double driveX() {
    	return(stickDeadBand(-xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_X_AXIS),.2));
	}
	
    //Strife
	public double driveY() {
		// The driveY is the "Y" Axis of the Driver Gamepad.
		// However, the joysticks give -1.0 on the Y axis when pushed forward
		// This method reverses that, so that positive numbers are forward
		return (stickDeadBand(-xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_Y_AXIS),.2));
	}
	public double driveLTigger(){
		return xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_TRIGGER);
	}
	public double driveRotation() {
		return stickDeadBand(xBox_Driver.getRawAxis(GAMEPAD_XBOX_RIGHT_X_AXIS),.2);
	}

	public boolean driveTurboMode() {
		return(xBox_Driver.getRawButton(GAMEPAD_XBOX_LEFT_BUTTON) || xBox_Driver.getRawAxis(GAMEPAD_XBOX_LEFT_TRIGGER)>0.2);
		
	}
	public boolean crawlBackward() {
        return(xBox_Driver.getRawButton(GAMEPAD_XBOX_A_BUTTON));
       
    }
	public boolean crawlForward() {
    	return(xBox_Driver.getRawButton(GAMEPAD_XBOX_Y_BUTTON));
    }
    
    public boolean crawlLeft() {
    	return(xBox_Driver.getRawButton(GAMEPAD_XBOX_B_BUTTON));
    }
    
    public boolean crawlRight() {
    	return(xBox_Driver.getRawButton(GAMEPAD_XBOX_X_BUTTON));
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getxBox_Driver() {
        return xBox_Driver;
    }

    public Joystick getxBox_CoDriver() {
        return xBox_CoDriver;
    }

    public Joystick getlaunchPad() {
        return launchPad;
    }
    
    public double elevatorCommand(){
    	return(launchPad.getRawAxis(1));
    }

	public double get_FlyWheel_Command() {
		
		return Utils.scale(launchPad.getRawAxis(0), -1.0, 1.0, 0.7, 1.0);//launchPad.getRawAxis(0);
	}


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

