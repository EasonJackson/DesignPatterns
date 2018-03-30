package com.eason.JavaPatterns.Strategy;

public class ApplePayStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(amount + "paid by ApplePay.");
    }
}
