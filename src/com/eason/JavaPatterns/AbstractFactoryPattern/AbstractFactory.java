package com.eason.JavaPatterns.AbstractFactoryPattern;

/**
 * Created by easonjackson on 12/29/17.
 */
public interface AbstractFactory {
    Car buildCar(String brand, String make, int year);
}
