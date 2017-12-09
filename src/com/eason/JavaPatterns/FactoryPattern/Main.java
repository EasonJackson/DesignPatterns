package com.eason.JavaPatterns.FactoryPattern;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Main {

    public static void main(String[] args) {
        Computer hp = ComputerFactory.genComputer("PC", "Core dual", "Nvidia GeForce", 500, 1200.99);
        Computer server = ComputerFactory.genComputer("Server", "Xeon", "None", 500000, 500000);

        System.out.println(hp);
        System.out.println(server);
    }
}
