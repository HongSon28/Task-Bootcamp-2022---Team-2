package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Drivebase {
    private DcMotorEx left, right;
    public Drivebase(HardwareMap hardwareMap) {
        left = hardwareMap.get(DcMotorEx.class,"leftDrive");
        right = hardwareMap.get(DcMotorEx.class, "rightDrive");

        left.setDirection(DcMotorSimple.Direction.FORWARD);
        right.setDirection(DcMotorSimple.Direction.REVERSE);

        left.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
        right.setZeroPowerBehavior(DcMotorEx.ZeroPowerBehavior.BRAKE);
    }
    public void setDrivePower(double leftPw, double rightPw) {
        left.setPower(leftPw);
        right.setPower(rightPw);
    }
}
