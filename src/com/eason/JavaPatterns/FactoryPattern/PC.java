package com.eason.JavaPatterns.FactoryPattern;

/**
 * Created by easonjackson on 6/15/17.
 */
public class PC extends Computer {

    private String garantee;

    public PC (String CPU,
               String GPU,
               int storage,
               double price,
               String garantee) {
        super(CPU, GPU, storage, price);
        this.garantee = garantee;

    }

    public String getGarantee() {
        return garantee;
    }
}
