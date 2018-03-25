package com.eason.JavaPatterns.Singleton;

/**
 * Created by easonjackson on 6/15/17.
 */
public enum SingletonEnum {
    SingletonInstance(0);

    private int id;

    SingletonEnum(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
