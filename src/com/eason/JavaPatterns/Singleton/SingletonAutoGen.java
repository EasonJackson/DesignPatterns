package com.eason.JavaPatterns.Singleton;

/**
 * Created by easonjackson on 6/15/17.
 */
public class SingletonAutoGen {
    private static final SingletonAutoGen ourInstance = new SingletonAutoGen(0);
    private int id;

    public static SingletonAutoGen getInstance() {
        return ourInstance;
    }

    private SingletonAutoGen(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
