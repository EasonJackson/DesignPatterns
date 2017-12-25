package com.eason.JavaPatterns.ObserverPattern;

/**
 * Created by easonjackson on 12/25/17.
 */
public interface Subject {

    Subject register(Observer obj);
    Subject unregister(Observer obj);

    void notifyObservers();

    Object getUpdate(Observer obj);
}
