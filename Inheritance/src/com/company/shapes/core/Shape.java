package com.company.shapes.core;

public abstract class Shape {
    protected final double area;

    public Shape(double area) {
        this.area = area;
    }

    public String toString() {
        return this.getClass().getSimpleName() + ", area: " + this.area;
    }
}
