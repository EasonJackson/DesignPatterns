package com.eason.JavaPatterns.Decorator;

/**
 * Created by easonjackson on 3/11/18.
 */
public class DeadShooter extends BasicRifle {
    private static final int NUM_BULLETS = 10;
    private static final int BULLETS_PER_SHOT = 1;

    DeadShooter() {
        this.bulletCount = NUM_BULLETS;
        this.power = 10;
        this.accuracy = 100;
    }

    @Override
    public void fire() {
        if (this.bulletCount == 0) {
            System.out.println("Reload shooter bullets.");
            reload();
        }
        this.bulletCount -= BULLETS_PER_SHOT;
        System.out.println("Power: " + this.power);
        System.out.println("Accuracy: " + this.accuracy);
    }

    @Override
    public void reload() {
        this.bulletCount = NUM_BULLETS;
    }
}
