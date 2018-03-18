package com.eason.JavaPatterns.ChainOfResponsibility;

public class Cash10Dispenser implements ATMDispenserChain {
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

        if (cash >= 10) {
            System.out.println("Dispending $10 " + cash / 10);
        }

        if (nextDispenser != null) {
            nextDispenser.dispense(cash % 10);
        }
    }
}
