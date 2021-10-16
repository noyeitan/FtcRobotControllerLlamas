 package org.firstinspires.ftc.teamcode;

            import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
            import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "AutoDuck", group = "12806")
public class AutoDuck extends LinearOpMode {

    Robokenbot robot = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {

        robot.init(hardwareMap, this);

        waitForStart();
        robot.claw.setPosition(1.0);
        robot.moveArmByTime(0.5, 1500);
        robot.driveForwardByTime(robot.DRIVE_SPEED, 1000);
        robot.turnLeftByTime(robot.DRIVE_SPEED, 850);
        robot.driveForwardByTime(robot.DRIVE_SPEED * 1.5, 1300);
        robot.moveArmByTime(-0.5,   150);
        robot.claw.setPosition(0.0);
        robot.driveForwardByTime(-robot.DRIVE_SPEED, 1000);
        robot.turnRightByTime(robot.DRIVE_SPEED, 3000);
        robot.driveForwardByTime(3 * robot.DRIVE_SPEED, 3000);
    }
}


