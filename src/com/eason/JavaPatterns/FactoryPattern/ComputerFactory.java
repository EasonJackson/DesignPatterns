package com.eason.JavaPatterns.FactoryPattern;

/**
 * Created by easonjackson on 6/15/17.
 */
public class ComputerFactory {

    public static Computer genComputer (String type,
                                        String CPU,
                                        String GPU,
                                        int storage,
                                        double price) {
        if(type == "PC") {
            return new PC(CPU, GPU, storage, price, "1 Year Guarantee");
        } else if (type == "Server") {
            return new Server(CPU, GPU, storage, price);
        } else {
            return null;
        }
    }
}
