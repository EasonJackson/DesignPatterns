package com.eason.JavaPatterns.Decorator;

/**
 * Created by easonjackson on 3/11/18.
 */
public abstract class BasicRifle {
    int power;
    int bulletCount;
    int accuracy;

    public abstract void fire();
    public abstract void reload();
}
