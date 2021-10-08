package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "AutoTest", group = "12806")
public class AutoTest extends LinearOpMode {

    Robokenbot robot   = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap,this);

        waitForStart();

        robot.encoderDrive(robot.DRIVE_SPEED,  25,25,50.0, this);  // S1: Forward 24 Inches with 5 Sec timeout
        robot.rotate(90, robot.DRIVE_SPEED, true, this);
        robot.driveForwardByTime(robot.DRIVE_SPEED, 500);
    }
}
