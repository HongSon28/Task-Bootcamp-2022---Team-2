package org.firstinspires.ftc.teamcode.Subsystems;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Climber {
    private DcMotor climber;
    public Climber(HardwareMap hardwareMap) {
        climber = hardwareMap.get(DcMotor.class,"slideDC");
        climber.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        climber.setPower(0);
    }

    public void setClimber(double Power) {
        climber.setPower(Power);
    }
}
