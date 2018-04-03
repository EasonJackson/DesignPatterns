package com.eason.JavaPatterns.State;

/**
 * Vending Machine in NoSelection state
 */
public class NoSelection implements State {
    private VendingMachine vendingMachine;

    NoSelection(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Already inserted money");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected");
        this.vendingMachine.changeFromNoSelectionToPaidSelected();
    }

    @Override
    public void transect() {
        System.err.println("No item selected");
    }
}
