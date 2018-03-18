package com.eason.JavaPatterns.ChainOfResponsibility;

public class Cash50Dispenser implements ATMDispenserChain{
    private ATMDispenserChain nextDispenser;

    @Override
    public void setNextChainRespsonsibler(ATMDispenserChain dispenserChain) {
        this.nextDispenser = dispenserChain;
    }

    @Override
    public void dispense(int cash) {
        if (cash <= 0) {
            return;
        }

        if (cash >= 50) {
            System.out.println("Dispending $50: " + cash / 50);
        }

        if (nextDispenser != null) {
            nextDispenser.dispense(cash % 50);
        }
    }
}
