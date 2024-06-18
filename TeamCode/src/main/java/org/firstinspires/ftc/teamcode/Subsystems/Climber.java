package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Climber {
    private DcMotor climber;
    HardwareMap hardwareMap;
    public Climber(OpMode opMode) {
        hardwareMap = opMode.hardwareMap;
    }
    public void init() {
        climber = hardwareMap.get(DcMotor.class,"slideDC");
        climber.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        climber.setPower(0);
    }
    public void setClimber(double Power) {
        climber.setPower(Power);
    }
}
