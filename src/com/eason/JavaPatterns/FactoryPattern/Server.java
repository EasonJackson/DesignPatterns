package com.eason.JavaPatterns.FactoryPattern;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Server extends Computer {

    public Server(String CPU, String GPU, int storage, double price) {
        super(CPU, GPU, storage, price);
    }
}
