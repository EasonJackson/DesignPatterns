package com.eason.JavaPatterns.Composite;

import java.awt.*;

/**
 * Created by easonjackson on 1/25/18.
 */
public abstract class Component {
    public int id;

    public abstract void changeColor(Color color);
    public abstract void close();
    public abstract Component open();
}
