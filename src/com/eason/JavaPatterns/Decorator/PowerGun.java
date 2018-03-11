package com.eason.JavaPatterns.Decorator;

/**
 * Created by easonjackson on 3/11/18.
 */
public class PowerGun extends BasicRifle {
    private static final int NUM_BULLETS = 30;
    private static final int BULLETS_PER_SHOT = 5;

    PowerGun() {
        this.bulletCount = NUM_BULLETS;
        this.power = 100;
        this.accuracy = 10;
    }

    @Override
    public void fire() {
        if (this.bulletCount == 0) {
            System.out.println("Reload power bullets.");
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
