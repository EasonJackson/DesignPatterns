package com.eason.JavaPatterns.Flyweight;

import java.util.Hashtable;

/**
 * Created by easonjackson on 6/15/17.
 */
public class ShapeFactory {

    private static final Hashtable<ShapeType, Shape> SHAPES = new Hashtable<ShapeType, Shape>();

    public static Shape getShape(ShapeType type) {
        Shape shape = SHAPES.get(type);

        if (shape == null) {
            if (type.equals(ShapeType.OVAL_FILL)) {
                shape = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shape = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shape = new Line();
            }
            SHAPES.put(type, shape);
        }
        return shape;
    }

    public enum ShapeType{
        OVAL_FILL, OVAL_NOFILL, LINE;
    }
}
