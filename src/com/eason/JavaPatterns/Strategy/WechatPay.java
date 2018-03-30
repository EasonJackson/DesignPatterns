package com.eason.JavaPatterns.Strategy;

public class WechatPay implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println(amount + "paid by WechatPay.");
    }
}
