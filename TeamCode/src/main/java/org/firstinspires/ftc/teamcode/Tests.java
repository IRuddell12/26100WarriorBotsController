package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class Tests extends OpMode {

    public void init() {

    }

    @Override
    public void loop() {
        int teamNumber = 26100;
        double leftStickY = -gamepad1.left_stick_y;
        double rightStickY = -gamepad1.right_stick_y;
        telemetry.addData("Hello", teamNumber);
        telemetry.addData("left x", gamepad1.left_stick_x );
        telemetry.addData("left y", leftStickY );
        telemetry.addData("right x", gamepad1.right_stick_x );
        telemetry.addData("right y", rightStickY );
        telemetry.addData("left trigger", gamepad1.left_trigger );
        telemetry.addData("right trigger", gamepad1.right_trigger );
    }
}
