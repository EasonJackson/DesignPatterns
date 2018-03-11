package com.eason.JavaPatterns.Decorator;

/**
 * Created by easonjackson on 3/11/18.
 */
public class Main {

    public static void main(String[] args) {
        BasicRifle rifle = new PowerGun();
        rifle.fire();

        UltraBulletGun ultraPowerGun = new UltraBulletGun(rifle);
        ultraPowerGun.fire();

        AccuracyRaiser accuracyRaiserPowerGun = new AccuracyRaiser(ultraPowerGun);
        accuracyRaiserPowerGun.fire();
    }
}
