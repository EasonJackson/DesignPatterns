package com.eason.JavaPatterns.State;

/**
 * Vending Machine under NoCoinInserted state
 */
public class NoCoinInserted implements State {
    private VendingMachine vendingMachine;

    NoCoinInserted(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Insert coins");
        this.vendingMachine.changeFromNoCoinToNoSelectionState();
    }

    @Override
    public void selectItem() {
        System.err.println("Not enough money");
    }

    @Override
    public void transect() {
        System.out.println("Not enough money");
    }
}
