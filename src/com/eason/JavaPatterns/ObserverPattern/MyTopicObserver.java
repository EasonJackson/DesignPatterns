package com.eason.JavaPatterns.ObserverPattern;

/**
 * Created by easonjackson on 12/25/17.
 */
public class MyTopicObserver implements Observer {

    private String name;
    private Subject topic;

    public MyTopicObserver(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " : No new message.");
        } else {
            System.out.println(name + " : Consuming message : " + msg);
        }
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic = sub;
    }
}
