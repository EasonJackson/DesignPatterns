package com.eason.JavaPatterns.AbstractFactoryPattern;

/**
 * Created by easonjackson on 1/3/18.
 */
public class Main {

    public static void main (String[] args) {
        AbstractFactory factory = new FactoryBenz();
        Car benz = factory.buildCar("Benz", "&&", 1990);
    }
}
