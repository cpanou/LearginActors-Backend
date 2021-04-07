package com.company.shapes.core;

public abstract class Shape2D extends Shape {
    private final boolean label;

    public Shape2D(double area, boolean label) {
        super(area);
        this.label = label;
    }

    @Override
    public String toString(){
        return super.toString() + ", label: " + label;
    }

}
