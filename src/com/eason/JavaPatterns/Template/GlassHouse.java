package com.eason.JavaPatterns.Template;

public class GlassHouse extends HouseTemplate {
    @Override
    void buildPillars() {
        System.out.println("Build glass house pillars");
    }

    @Override
    void buildWalls() {
        System.out.println("Build glass house walls");
    }

    @Override
    void buildWindows() {
        System.out.println("Build glass house windows");
    }
}
