package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Hopper extends SubsystemBase{
    private TalonFX hopperMotor;
    

    public Hopper() {
        hopperMotor = new TalonFX(4);
    }

    public void rotateHopperClockwise(double speed) {
        hopperMotor.set(speed);
    }

    public void rotateHopperCounterClockwise(double speed) {
        hopperMotor.set(-speed);
    }

    public void stopRotation() {
        hopperMotor.stopMotor();
    }
    
    public Command stopCommand() {
        return new RunCommand(()->stopRotation(), this);
    } 

    public Command clockWiseCommand() {
        return new RunCommand(()->rotateHopperClockwise(0.3), this);
    }
    public Command counterClockWiseCommand() {
        return new RunCommand(()->rotateHopperCounterClockwise(0.3), this);
    }
}
