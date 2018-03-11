package com.eason.JavaPatterns.Decorator;

/**
 * Created by easonjackson on 3/11/18.
 */
public class AccuracyRaiser extends GunDecorator {

    AccuracyRaiser(BasicRifle rifle) {
        this.basicRifle = rifle;
    }

    @Override
    public void fire() {
        if (this.basicRifle.bulletCount == 0) {
            reload();
        }
        System.out.println("Accuracy increased 20.");
        this.basicRifle.fire();
    }

    @Override
    public void reload() {
        this.basicRifle.reload();
    }
}
