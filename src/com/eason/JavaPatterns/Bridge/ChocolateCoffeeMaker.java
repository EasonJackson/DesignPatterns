package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public class ChocolateCoffeeMaker implements CoffeeMaker {

    ChocolateCoffeeMaker() {

    }

    public String getCoffee() {
        return "... adding chocolate.";
    }
}
