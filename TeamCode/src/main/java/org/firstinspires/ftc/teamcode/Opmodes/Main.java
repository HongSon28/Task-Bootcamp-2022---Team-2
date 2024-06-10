package org.firstinspires.ftc.teamcode.Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

@TeleOp(name = "Main")
public class Main extends LinearOpMode {
    private Drivebase drivetrain;
    public void runOpMode() {
        drivetrain = new Drivebase(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            drivetrain.setDrivePower(-gamepad1.left_stick_y,-gamepad1.right_stick_y);
        }
    }
}
