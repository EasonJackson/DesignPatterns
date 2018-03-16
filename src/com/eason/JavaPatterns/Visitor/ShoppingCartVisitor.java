package com.eason.JavaPatterns.Visitor;

public interface ShoppingCartVisitor {
    double visit(AbstractItem item);
}
