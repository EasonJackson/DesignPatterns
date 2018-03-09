package com.eason.JavaPatterns.ObserverPattern;

/**
 * Created by easonjackson on 12/25/17.
 */
public class Main {

    public static void main(String[] args) {
        NYTimes myTopic = new NYTimes();

        Observer o1 = new MyTopicObserver("Obj1");
        Observer o2 = new MyTopicObserver("Obj2");
        Observer o3 = new MyTopicObserver("Obj3");

        myTopic.register(o1).register(o2).register(o3);

        o1.setSubject(myTopic);
        o2.setSubject(myTopic);
        o3.setSubject(myTopic);

        o1.update();

        myTopic.postMessage("New message");

    }
}
