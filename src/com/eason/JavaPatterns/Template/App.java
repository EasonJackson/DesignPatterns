package com.eason.JavaPatterns.Template;

public class App {

    public static void main(String[] args) {
        HouseTemplate house1 = new WoodenHouse();
        house1.buildHouse();

        HouseTemplate house2 = new GlassHouse();
        house2.buildHouse();
    }
}
