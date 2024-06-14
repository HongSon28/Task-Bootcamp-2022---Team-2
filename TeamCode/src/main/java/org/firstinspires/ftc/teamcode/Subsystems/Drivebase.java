package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivebase {
    private DcMotor left, right, climber;
    public Drivebase(HardwareMap hardwareMap) {
        left = hardwareMap.get(DcMotor.class,"leftDrive");
        right = hardwareMap.get(DcMotor.class, "rightDrive");
        climber = hardwareMap.get(DcMotor.class, "sliderHexCore");
        climber.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void setDrivePower(double leftPw, double rightPw) {
        left.setPower(leftPw);
        right.setPower(rightPw);
    }

    public void setClimber(double Power) {
        climber.setPower(Power);
    }
}