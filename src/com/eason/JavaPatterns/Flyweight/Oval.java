package com.eason.JavaPatterns.Flyweight;

import java.awt.*;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating Oval object with fill=" + this.fill);
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle,
                     int x,
                     int y,
                     int weight,
                     int height,
                     Color color) {
        circle.setColor(color);
        circle.drawOval(x, y, weight, height);
        if(fill) {
            circle.fillOval(x, y, weight, height);
        }
    }
}
