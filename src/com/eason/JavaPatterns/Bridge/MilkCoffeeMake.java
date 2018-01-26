package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public class MilkCoffeeMake extends CoffeeMaker {

    MilkCoffeeMake() {

    }

    public String getCoffee() {
        return "... adding milk.";
    }
}
