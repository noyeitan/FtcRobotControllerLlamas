package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "BLUE/DuckHubPark@4", group = "12806")
public class BlueDuckHubPark extends LinearOpMode {

    Robokenbot robot = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, this);

        robot.claw.setPosition(1.0);
        Thread.sleep(700);
        robot.moveArmByTime(0.75, 2000);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 1150);
        robot.moveArmByTime(-0.3, 350);
//        Thread.sleep(100);
        robot.claw.setPosition(0.0);
        Thread.sleep(500);
  //      robot.claw.setPosition(1.0);
        robot.moveArmByTime(0.50, 2000);
        robot.driveForwardByTime(-robot.DRIVE_SPEED * 2, 200);
        robot.turnLeftByTime(robot.DRIVE_SPEED, 1900 );
        robot.driveForwardByTime(-robot.DRIVE_SPEED * 2, 2600);
        robot.strafeLeftByTime(robot.DRIVE_SPEED * 2, 1150);
        robot.spin(true, 3800);
        if (true) {
            robot.strafeRightByTime(robot.DRIVE_SPEED * 2, 1500);
        } else {
            robot.strafeRightByTime(robot.DRIVE_SPEED * 2, 50);
            robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 3500 );
        }


    }
}