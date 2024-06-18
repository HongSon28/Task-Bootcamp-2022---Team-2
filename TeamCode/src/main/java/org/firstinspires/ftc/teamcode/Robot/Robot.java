package org.firstinspires.ftc.teamcode.Robot;


import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.Gamepad;

import org.firstinspires.ftc.teamcode.Subsystems.Climber;
import org.firstinspires.ftc.teamcode.Subsystems.Drivebase;
import static org.firstinspires.ftc.teamcode.Constants.SPEED.*;

public class Robot {
    private Drivebase drive;
    private Climber climber;
    private Gamepad gamepad;

    public Robot(OpMode opMode) {
        drive = new Drivebase(opMode);
        climber = new Climber(opMode);
        gamepad = opMode.gamepad1;
    }

    public void init() {
        drive.init();
        climber.init();
    }

    public void loop() {
        drive.setDrivePower(-gamepad.left_stick_y,-gamepad.right_stick_y);

        if(gamepad.circle) {
            climber.setClimber(SLIDE_SPEED);
        } else if(gamepad.square) {
            climber.setClimber(-SLIDE_SPEED);
        } else {
            climber.setClimber(0);
        }
    }
}
