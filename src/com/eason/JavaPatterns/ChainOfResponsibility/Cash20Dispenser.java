package com.eason.JavaPatterns.ChainOfResponsibility;

public class Cash20Dispenser implements ATMDispenserChain {
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

        if (cash >= 20) {
            System.out.println("Dispending $20: " + cash / 20);
        }

        if (nextDispenser != null) {
            nextDispenser.dispense(cash % 20);
        }
    }
}
