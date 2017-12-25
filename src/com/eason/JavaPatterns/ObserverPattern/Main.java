package com.eason.JavaPatterns.ObserverPattern;

/**
 * Created by easonjackson on 12/25/17.
 */
public class Main {

    public static void main(String[] args) {
        MySubject myTopic = new MySubject();

        Observer o1 = new MyTopicSubscriber("Obj1");
        Observer o2 = new MyTopicSubscriber("Obj2");
        Observer o3 = new MyTopicSubscriber("Obj3");

        myTopic.register(o1).register(o2).register(o3);

        o1.setSubject(myTopic);
        o2.setSubject(myTopic);
        o3.setSubject(myTopic);

        o1.update();

        myTopic.postMessage("New message");

    }
}
