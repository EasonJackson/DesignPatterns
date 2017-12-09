package com.eason.JavaPatterns.FactoryPattern;

/**
 * Created by easonjackson on 6/15/17.
 */
public abstract class Computer {
    private String CPU;
    private String GPU;

    private int storage;
    private double price;

    public Computer (String CPU,
                     String GPU,
                     int storage,
                     double price) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.storage = storage;
        this.price = price;
    }

    public String getCPU() {
        return CPU;
    }

    public String getGPU() {
        return GPU;
    }

    public int getStorage() {
        return storage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Computer: " + CPU + " " + GPU + " " + "Storage: " + storage + "GB, " + "Price: " + price;
    }
}
