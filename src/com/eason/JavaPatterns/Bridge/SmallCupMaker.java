package com.eason.JavaPatterns.Bridge;

/**
 * Created by easonjackson on 1/25/18.
 */
public class SmallCupMaker extends AbstractCoffeeMachine {

    @Override
    public void makeMilkCoffee(MilkCoffeeMake coffeeMake) {
        System.out.print("Preparing small coffee," + coffeeMake.getCoffee());
    }

    @Override
    public void makeChocaCoffee(ChocolateCoffeeMaker coffeeMaker) {
        System.out.print("Preparing small coffee," + coffeeMaker.getCoffee());
    }
}
