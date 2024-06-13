package org.firstinspires.ftc.teamcode.Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

@TeleOp(name = "Main")
public class Main extends LinearOpMode {
    private Drivebase drive;
    public void runOpMode() {
        drive = new Drivebase(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            double y = -gamepad1.left_stick_y;
            double rx = gamepad1.right_stick_x;
            double max = Math.abs(y) + Math.abs(rx);
            max = Math.max(max, 1);
            double pLeft = (y + rx) / max;
            double pRight = (y - rx) / max;
            drive.setDrivePower(pLeft, pRight);
            if(gamepad1.circle) {
                drive.setClimber(0.7);
            } else if(gamepad1.square) {
                drive.setClimber(-0.7);
            }
        }
    }
}