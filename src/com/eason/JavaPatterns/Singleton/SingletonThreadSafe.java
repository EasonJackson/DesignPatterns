package com.eason.JavaPatterns.Singleton;

public class SingletonThreadSafe {
    private static SingletonThreadSafe instance = null;

    private SingletonThreadSafe() {

    }

    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
