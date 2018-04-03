package com.eason.JavaPatterns.State;

public class PaidSelected implements State {
    private VendingMachine vendingMachine;

    PaidSelected(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Already paid");
    }

    @Override
    public void selectItem() {
        System.out.println("Aready selected");
    }

    @Override
    public void transect() {
        System.out.println("Finishing transaction");
        this.vendingMachine.changeFromPaidSelectedToOrigin();
    }
}
