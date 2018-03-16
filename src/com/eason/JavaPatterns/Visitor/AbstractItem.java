package com.eason.JavaPatterns.Visitor;

public abstract class AbstractItem {
    String name;
    double price;
    double discount;
    int quantity;

    AbstractItem(String name, double price, double discount) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.quantity = 1;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    abstract double accept(ShoppingCartVisitor visitor);
}
