package com.company;

import com.company.shapes.core.Shape;
import com.company.shapes.model.Circle;
import com.company.shapes.model.Cube;
import com.company.shapes.model.Sphere;
import com.company.shapes.model.Square;

import java.util.ArrayList;
import java.util.List;

public class Shapes {

    public static void main(String[] args) {
        // write your code here
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(new Circle(25.5));
        shapeList.add(new Square(10.0));
        shapeList.add(new Sphere(125.0));
        shapeList.add(new Cube(100));
        shapeList.forEach(shape -> System.out.println(shape.toString()));
    }

}
