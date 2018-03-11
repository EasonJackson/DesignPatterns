package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public class MilkCoffeeMake implements CoffeeMaker {

    MilkCoffeeMake() {

    }

    public String getCoffee() {
        return "... adding milk.";
    }
}
