package com.eason.JavaPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by easonjackson on 12/25/17.
 */
public class MySubject implements Subject {

    private List<Observer> observers;
    private String message;
    private boolean changed;
    private  final Object MUTEX = new Object();

    public MySubject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public Subject register(Observer obj) {
        if (obj == null) throw new NullPointerException("Null Observer");
        synchronized (MUTEX) {
            if(!observers.contains(obj)) {
                observers.add(obj);
            }
        }
        return this;
    }

    @Override
    public Subject unregister(Observer obj) {
        synchronized (MUTEX) {
            observers.remove(obj);
        }
        return this;
    }

    @Override
    public void notifyObservers() {
        List<Observer> observersLocal = null;
        synchronized (MUTEX) {
            if (!changed) {
                return;
            }
            observersLocal = new ArrayList<>(this.observers);
            this.changed = false;
        }

        for (Observer obj : observersLocal) {
            obj.update();
        }
    }

    @Override
    public Object getUpdate(Observer obj) {
        return this.message;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to topic: " + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}
