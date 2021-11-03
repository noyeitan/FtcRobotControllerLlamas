package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "BLUE/DuckHubPark@1", group = "12806")
public class BlueDuckHubPark extends LinearOpMode {

    Robokenbot robot = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, this);

        robot.claw.setPosition(1.0);
        Thread.sleep(700);
        robot.moveArmByTime(0.75, 2000);
        //       if (!redTeam){
        //rotate();
        // }
        robot.strafeLeftByTime( -robot.DRIVE_SPEED * 1.5, 1650);
        robot.driveForwardByTime(-robot.DRIVE_SPEED, 500);
        robot.spin(!clockwise, -3800);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 1500);
        robot.turnByTime(turnRight-robot.DRIVE_SPEED, 2000);
        robot.moveArmByTime(0.75, 2000);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 1200);
        robot.moveArmByTime(-0.3,   350);
        Thread.sleep(100);
        robot.claw.setPosition(0.0);
        robot.moveArmByTime(0.5, 350);
        robot.driveForwardByTime(-robot.DRIVE_SPEED * 2, 1300);
        robot.strafeRightByTime( robot.DRIVE_SPEED, 1000);
    }

}

