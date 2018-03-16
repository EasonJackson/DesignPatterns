package com.eason.JavaPatterns.Visitor;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<AbstractItem> shoppingList = new ArrayList<>();
        AbstractItem item1 = new Book("b1", 102.34, .20);
        item1.setQuantity(2);
        AbstractItem item2 = new Book("b2", 90.0, .25);
        AbstractItem item3 = new Wine("Rum", 20, .05);
        item3.setQuantity(10);
        shoppingList.add(item1);
        shoppingList.add(item2);
        shoppingList.add(item3);

        ShoppingCartVisitor checkout = new CartCheckoutVisitor();
        double totalPrice = 0.D;

        for (AbstractItem item : shoppingList) {
            totalPrice += item.accept(checkout);
        }

        System.out.print("Total cost of these item is " + totalPrice);
    }
}
