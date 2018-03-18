package com.eason.JavaPatterns.ChainOfResponsibility;

public interface ATMDispenserChain {

    void setNextChainRespsonsibler(ATMDispenserChain dispenserChain);
    void dispense(int cash);
}
