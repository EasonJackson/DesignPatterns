package com.eason.JavaPatterns.Composite;

import java.awt.*;

/**
 * Created by easonjackson on 1/25/18.
 */
public class MainMenu extends Component  {

    MainMenu(int id) {
        this.id = id;
    }

    @Override
    public void changeColor(Color color) {
        System.out.println("Using color: " + color.toString());
    }

    @Override
    public void close() {
        System.out.println("Close menu" + this.id);
    }

    @Override
    public Component open() {
        return this;
    }
}
