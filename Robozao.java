package competicao;

import robocode.*;
import java.awt.*;

public class Robozao extends AdvancedRobot {

    @Override
    public void run() {
        setColors(Color.MAGENTA, Color.DARK_GRAY, Color.BLUE, Color.PINK, Color.CYAN);
        while (true) {
            turnGunRight(10);
        }
    }

    @Override
    public void onScannedRobot(ScannedRobotEvent event) {
        double distance = event.getDistance();
        if (distance < 100) {
            fire(3);
        } else {
            fire(2);
        }
    }

    @Override
    public void onHitByBullet(HitByBulletEvent event) {
        back(50);
        turnRight(45);
    }

    @Override
    public void onHitWall(HitWallEvent event) {
        back(20);
        turnRight(90);
    }
}
