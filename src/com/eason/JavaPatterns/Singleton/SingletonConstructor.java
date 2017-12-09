package com.eason.JavaPatterns.Singleton;

/**
 * Created by easonjackson on 6/15/17.
 */
public class SingletonConstructor {

    private static SingletonConstructor singleton;

    private SingletonConstructor() {};

    public static SingletonConstructor getInstance() {
        if (singleton == null) {
            singleton = new SingletonConstructor();
        }

        return singleton;
    }
}
