package com.eason.JavaPatterns.Template;

public abstract class HouseTemplate {
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("House is built.");
    }

    private void buildFoundation() {
        System.out.println("Build house foundation");
    }

    abstract void buildPillars();
    abstract void buildWalls();
    abstract void buildWindows();
}
