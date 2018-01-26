package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public class LargeCupMaker extends AbstractCoffeeMachine {

    @Override
    public void makeMilkCoffee(MilkCoffeeMake coffeeMaker) {
        System.out.print("Preparing large coffee," + coffeeMaker.getCoffee());
    }

    @Override
    public void makeChocaCoffee(ChocolateCoffeeMaker coffeeMaker) {
        System.out.print("Preparing large coffee," + coffeeMaker.getCoffee());
    }
}
