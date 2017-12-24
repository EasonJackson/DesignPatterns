package com.eason.JavaPatterns.Adapter;

/**
 * Created by easonjackson on 12/23/17.
 */
public class Socket {
    public Volt getVolt() {
        return new Volt(120);
    }
}
