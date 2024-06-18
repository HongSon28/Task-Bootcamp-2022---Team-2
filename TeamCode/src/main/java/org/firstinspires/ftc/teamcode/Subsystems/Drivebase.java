package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivebase {
    private DcMotor left, right;
    private HardwareMap hardwareMap;
    public Drivebase(OpMode opMode) {
        hardwareMap = opMode.hardwareMap;
    }
    public void init() {
        left = hardwareMap.get(DcMotor.class,"leftDrive");
        right = hardwareMap.get(DcMotor.class, "rightDrive");

        left.setDirection(DcMotorSimple.Direction.FORWARD);
        right.setDirection(DcMotorSimple.Direction.REVERSE);

        left.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        right.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void setDrivePower(double leftPw, double rightPw) {
        left.setPower(leftPw);
        right.setPower(rightPw);
    }


}