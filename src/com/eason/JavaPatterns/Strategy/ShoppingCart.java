package com.eason.JavaPatterns.Strategy;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart{

    private class Item implements Comparable<Item>{
        final double price;
        final String name;

        Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public int compareTo(Item o) {
            if (this.price == o.price && this.name.equals(o.name)) {
                return 0;
            } else {
                return this.name.compareTo(o.name);
            }
        }
    }

    private Map<Item, Integer> shoppinglist;

    ShoppingCart() {
        this.shoppinglist = new HashMap<>();
    }

    public void addItem(String name, int price, int quality) {
        Item item = new Item(name, price);
        int curr = shoppinglist.getOrDefault(item, 0);
        shoppinglist.put(item, curr + quality);
    }

    private double getTotal() {
        double sum = 0;
        for (Item key : shoppinglist.keySet()) {
            sum += key.price * shoppinglist.get(key);
        }

        return sum;
    }

    public void pay(PaymentStrategy strategy) {
        strategy.pay(this.getTotal());
    }
}
