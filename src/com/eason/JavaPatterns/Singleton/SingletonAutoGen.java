package com.eason.JavaPatterns.Singleton;

/**
 * Created by easonjackson on 6/15/17.
 */
public class SingletonAutoGen {
    private static SingletonAutoGen ourInstance = new SingletonAutoGen();

    public static SingletonAutoGen getInstance() {
        return ourInstance;
    }

    private SingletonAutoGen() {
    }
}
