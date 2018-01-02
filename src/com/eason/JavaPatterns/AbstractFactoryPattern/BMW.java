package com.eason.JavaPatterns.AbstractFactoryPattern;

/**
 * Created by easonjackson on 1/2/18.
 */
public class BMW extends Car {

    BMW (String brand, String make, int year) {
        this.brand = brand;
        this.make = make;
        this.year = year;
    }

    @Override
    void driving() {

    }
}
