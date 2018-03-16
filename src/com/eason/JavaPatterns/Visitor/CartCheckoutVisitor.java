package com.eason.JavaPatterns.Visitor;

public class CartCheckoutVisitor implements ShoppingCartVisitor {


    @Override
    public double visit(AbstractItem item) {
        if (item instanceof Book) {
            return item.price * (1.D - item.discount) * item.quantity;
        } else if (item instanceof Wine) {
            return item.price * (1.D - 2.D * item.discount) * item.quantity;
        } else {
            return 0.D;
        }
    }
}
