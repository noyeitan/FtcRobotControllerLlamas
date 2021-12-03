package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "RED/DuckHubPark@2", group = "12806")
public class RedDuckHubPark extends LinearOpMode {

    Robokenbot robot = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, this);

        waitForStart();
        robot.baseDuckHubParkA(true);
    }
}
