package com.eason.JavaPatterns.ChainOfResponsibility;

public class App {

    public static void main(String[] args) {
        ATMDispenserChain cashDispenser = new CashDispenser();
        ATMDispenserChain cash50Dispenser = new Cash50Dispenser();
        ATMDispenserChain cash20Dispenser = new Cash20Dispenser();
        ATMDispenserChain cash10Dispenser = new Cash10Dispenser();
        ATMDispenserChain cash1Dispenser = new Cash1Dispenser();

        cashDispenser.setNextChainRespsonsibler(cash50Dispenser);
        cash50Dispenser.setNextChainRespsonsibler(cash20Dispenser);
        cash20Dispenser.setNextChainRespsonsibler(cash10Dispenser);
        cash10Dispenser.setNextChainRespsonsibler(cash1Dispenser);

        int dispense_req1 = 512;
        cashDispenser.dispense(dispense_req1);

        int dispense_req2 = 1028;
        cashDispenser.dispense(dispense_req2);
    }
}
