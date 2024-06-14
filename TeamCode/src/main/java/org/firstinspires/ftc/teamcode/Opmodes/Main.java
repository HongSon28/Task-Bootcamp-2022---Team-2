package org.firstinspires.ftc.teamcode.Opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.Subsystems.Climber;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase;

@TeleOp(name = "Main")
public class Main extends LinearOpMode {
    private Drivebase drive;
    private Climber climber;
    private final double SLIDE_SPEED = 0.7;
    @Override
    public void runOpMode() {
        drive = new Drivebase(hardwareMap);
        climber = new Climber(hardwareMap);

        waitForStart();
        while (opModeIsActive()) {
            drive.setDrivePower(-gamepad1.left_stick_y,-gamepad1.right_stick_y);

            if(gamepad1.circle) {
                climber.setClimber(SLIDE_SPEED);
            } else if(gamepad1.square) {
                climber.setClimber(-SLIDE_SPEED);
            } else {
                climber.setClimber(0);
            }
        }
    }
}