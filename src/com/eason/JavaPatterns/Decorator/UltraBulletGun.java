package com.eason.JavaPatterns.Decorator;

/**
 * Created by easonjackson on 3/11/18.
 */
public class UltraBulletGun extends GunDecorator {

    private static final int EXTRA_BULLETS = 30;

    UltraBulletGun(BasicRifle rifle) {
        this.basicRifle = rifle;
        this.basicRifle.bulletCount += EXTRA_BULLETS;
    }

    @Override
    public void fire() {
        if (this.basicRifle.bulletCount == 0) {
            reload();
        }
        this.basicRifle.fire();
    }

    @Override
    public void reload() {
        this.basicRifle.reload();
        this.basicRifle.bulletCount += EXTRA_BULLETS;
    }
}
