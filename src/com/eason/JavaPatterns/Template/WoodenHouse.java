package com.eason.JavaPatterns.Template;

public class WoodenHouse extends HouseTemplate {
    @Override
    void buildPillars() {
        System.out.println("Build wooden house pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Build wooden house walls");
    }

    @Override
    void buildWindows() {
        System.out.println("Build wooden house windows");
    }
}
