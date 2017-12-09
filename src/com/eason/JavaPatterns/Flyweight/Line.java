package com.eason.JavaPatterns.Flyweight;

import java.awt.*;

/**
 * Created by easonjackson on 6/15/17.
 */
public class Line implements Shape {

    public Line(){
        System.out.println("Creating Line object");
        //adding time delay
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics g, int x, int y, int weight, int height, Color color) {
        g.setColor(color);
        g.drawLine(x, y, weight, height);
    }
}
