package com.eason.JavaPatterns.ChainOfResponsibility;

public class CashDispenser implements ATMDispenserChain {
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
        nextDispenser.dispense(cash);
    }
}
