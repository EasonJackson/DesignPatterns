package com.eason.JavaPatterns.Builder;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Main {

    public static void main(String[] args) {

        Car toyota = new Car.CarBuilder("Toyota", 2014).setMileage("10,000").setPrice(15000).build();
        Car honda = new Car.CarBuilder("Honda", 2000).build();

        System.out.println(toyota.toString());
        System.out.println(honda.toString());
    }
}
