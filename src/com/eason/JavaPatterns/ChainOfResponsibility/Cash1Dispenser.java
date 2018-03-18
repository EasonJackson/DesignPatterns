package com.eason.JavaPatterns.ChainOfResponsibility;

public class Cash1Dispenser implements ATMDispenserChain {
    @Override
    public void setNextChainRespsonsibler(ATMDispenserChain dispenserChain) {
        return;
    }

    @Override
    public void dispense(int cash) {
        if (cash <= 0) {
            return;
        }

        System.out.println("Dispending $1 " + cash);
    }
}
