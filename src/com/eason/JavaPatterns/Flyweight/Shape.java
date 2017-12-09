package com.eason.JavaPatterns.Flyweight;

import java.awt.*;

/**
 * Created by easonjackson on 6/15/17.
 */
public interface Shape {

    public void draw(Graphics g,
                     int x,
                     int y,
                     int weight,
                     int height,
                     Color color);
}
