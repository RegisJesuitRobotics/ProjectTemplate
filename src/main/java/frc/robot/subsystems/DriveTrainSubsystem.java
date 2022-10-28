// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveConstants;

public class DriveTrainSubsystem extends SubsystemBase {
    private final TalonSRX leftLeader = new TalonSRX(DriveConstants.DRIVE_FRONT_LEFT_ID);
    private final TalonSRX leftFollower = new TalonSRX(DriveConstants.DRIVE_BACK_LEFT_ID);
    private final TalonSRX rightLeader = new TalonSRX(DriveConstants.DRIVE_FRONT_RIGHT_ID);
    private final TalonSRX rightFollower = new TalonSRX(DriveConstants.DRIVE_BACK_RIGHT_ID);

    public DriveTrainSubsystem() {
        leftFollower.follow(leftLeader);
        rightFollower.follow(rightLeader);
    }

    public void tankDrive(double leftPercent, double rightPercent) {
        leftLeader.set(TalonSRXControlMode.PercentOutput, leftPercent);
        rightLeader.set(TalonSRXControlMode.PercentOutput, rightPercent);
    }
}
