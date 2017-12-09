package com.eason.JavaPatterns.Builder;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Car {

    //Required fields
    private String make;
    private int year;


    //Optional fields
    private double price;
    private String mileage;


    public Car (CarBuilder builder) {
        this.make = builder.make;
        this.year = builder.year;
        this.mileage = builder.mileage;
        this.price = builder.price;
    }

    //Builder class
    public static class CarBuilder {
        private String make;
        private int year;

        private String mileage = "0";
        private double price = 0;

        public CarBuilder (String make,
                           int year) {

            this.make = make;
            this.year = year;
        }

        public CarBuilder setMileage(String mileage) {
            this.mileage = mileage;
            return this;
        }

        public CarBuilder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Vehicle: " + this.make + this.year + " , " + this.mileage + ": sell at " + this.price;
    }
}
