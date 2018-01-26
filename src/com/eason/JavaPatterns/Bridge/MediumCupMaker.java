package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public class MediumCupMaker extends AbstractCoffeeMachine {

    @Override
    public void makeMilkCoffee(MilkCoffeeMake coffeeMaker) {
        System.out.print("Preparing medium  coffee," + coffeeMaker.getCoffee());
    }

    @Override
    public void makeChocaCoffee(ChocolateCoffeeMaker coffeeMaker) {
        System.out.print("Preparing medium coffee," + coffeeMaker.getCoffee());
    }
}
