package com.eason.JavaPatterns.ObserverPattern;

/**
 * Created by easonjackson on 12/25/17.
 */
public interface Observer {

    void update();

    void setSubject(Subject sub);
}
