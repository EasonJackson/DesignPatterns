package com.eason.JavaPatterns.AbstractFactoryPattern;

/**
 * Created by easonjackson on 12/29/17.
 */
public abstract class Car {
    String brand;
    String make;
    int year;

    abstract void driving();
}
