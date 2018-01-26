package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public abstract class AbstractCoffeeMachine {
    public abstract void makeMilkCoffee(MilkCoffeeMake coffeeMaker);
    public abstract void makeChocaCoffee(ChocolateCoffeeMaker coffeeMaker);
}
