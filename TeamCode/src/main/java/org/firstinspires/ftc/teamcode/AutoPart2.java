package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "AutoPart8", group = "12806")
public class AutoPart2 extends LinearOpMode {

    Robokenbot robot = new Robokenbot();
//
    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap, this);

        waitForStart();
        robot.claw.setPosition(1.0);
        sleep(500);
        robot.moveArmByTime(0.75, 2000);
        robot.strafeLeftByTime(robot.DRIVE_SPEED * 2, 1600);
        robot.driveForwardByTime(-robot.DRIVE_SPEED, 500);
        robot.spin(true /* clockwise */, 2000 /* time */);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 1500);
        robot.turnRightByTime(robot.DRIVE_SPEED, 2250);
        robot.moveArmByTime(0.75, 2000);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 1300);
        robot.moveArmByTime(-0.3,   350);
        sleep(100);
        robot.claw.setPosition(0.0);
        robot.moveArmByTime(0.5, 350);
        robot.driveForwardByTime(-robot.DRIVE_SPEED * 2, 1300);
        robot.strafeRightByTime(robot.DRIVE_SPEED, 1500);
    }
}


