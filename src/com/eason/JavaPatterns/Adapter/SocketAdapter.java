package com.eason.JavaPatterns.Adapter;

/**
 * Created by easonjackson on 12/23/17.
 */
public interface SocketAdapter {
    Volt getVolt120();
    Volt getVolt12();
    Volt getVolt3();
}
