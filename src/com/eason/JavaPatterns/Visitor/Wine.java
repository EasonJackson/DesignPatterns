package com.eason.JavaPatterns.Visitor;

public class Wine extends AbstractItem {

    Wine (String name, double price, double discount) {
        super(name, price, discount);
    }
    
    @Override
    double accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}
