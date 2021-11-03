package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous(name = "RED/WarehousePark@3", group = "12806")
public class RedWarehousePark extends LinearOpMode {

    Robokenbot robot = new Robokenbot();

    @Override
    public void runOpMode() throws InterruptedException {
        robot.init(hardwareMap, this);

        waitForStart();
        robot.baseWarehousePark(true);
    }
}
