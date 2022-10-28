package frc.robot.commands.drive;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.DifferentialDrive.WheelSpeeds;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

import java.util.function.DoubleSupplier;

public class TeleopDriveCommand extends CommandBase {
    private final DoubleSupplier xSupplier;
    private final DoubleSupplier rotationSupplier;

    private final DriveTrainSubsystem driveTrainSubsystem;

    public TeleopDriveCommand(
            DoubleSupplier xSupplier, DoubleSupplier rotationSupplier, DriveTrainSubsystem driveTrainSubsystem
    ) {
        this.xSupplier = xSupplier;
        this.rotationSupplier = rotationSupplier;
        this.driveTrainSubsystem = driveTrainSubsystem;

        addRequirements(driveTrainSubsystem);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void execute() {
        WheelSpeeds wheelSpeeds = DifferentialDrive
                .arcadeDriveIK(xSupplier.getAsDouble(), rotationSupplier.getAsDouble(), false);

        driveTrainSubsystem.tankDrive(wheelSpeeds.left, wheelSpeeds.right);
    }

    @Override
    public void end(boolean interrupted) {
        driveTrainSubsystem.tankDrive(0.0, 0.0);
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
