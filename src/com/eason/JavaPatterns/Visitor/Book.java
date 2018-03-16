package com.eason.JavaPatterns.Visitor;

public class Book extends AbstractItem{

    Book(String name, double price, double discount) {
        super(name, price, discount);
    }

    @Override
    double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
