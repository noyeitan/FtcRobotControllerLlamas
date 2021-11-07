package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "BLUE/DuckHubPark@4", group = "12806")
public class BlueDuckHubPark extends LinearOpMode {

    Robokenbot robot = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, this);
        waitForStart();

        robot.claw.setPosition(1.0);
        Thread.sleep(700);
        robot.moveArmByTime(1, 2000);
        robot.arm.setPower(0.2);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 1100);
        robot.moveArmByTime(-0.3, 350);
        robot.claw.setPosition(0.0);
        Thread.sleep(400);
        robot.moveArmByTime(0.75, 500);
        robot.driveForwardByTime(-robot.DRIVE_SPEED * 2, 400);
        robot.turnLeftByTime(robot.DRIVE_SPEED, 1700 );
        robot.driveForwardByTime(-robot.DRIVE_SPEED * 2, 2600);
        robot.strafeLeftByTime(robot.DRIVE_SPEED * 2, 1150);
        robot.strafeLeftByTime(robot.DRIVE_SPEED * 0.5, 150);
        robot.spin(false, 3800);
        if (true) {
            robot.strafeRightByTime(robot.DRIVE_SPEED * 2, 1500);
        } else {
            robot.strafeRightByTime(robot.DRIVE_SPEED * 2, 1500);
            robot.moveArmByTime(1, 2000);
            robot.arm.setPower(0.2);
            robot.driveForwardByTime(robot.DRIVE_SPEED * 2, 4500 );
        }


    }
}