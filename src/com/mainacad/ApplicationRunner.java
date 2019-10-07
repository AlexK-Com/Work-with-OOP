package com.mainacad;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;
import com.mainacad.circle.circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.triangle;

public class ApplicationRunner {
    public static void main(String[] args) {
        Square square = new Square();
        square.setSide(10.0);

        circle circle = new circle();
        circle.setRadius(10.0);

        triangle triangle = new triangle();
        triangle.setSide1(3.0);
        triangle.setSide2(4.0);
        triangle.setSide3(5.0);

        Shape maxShape;

        if (circle.getArea() > square.getArea())
        {
            maxShape = circle;
        }
        else {
            maxShape = square;
        }
        if (maxShape.getArea() < triangle.getArea()){
            maxShape = triangle;
        }

        System.out.println("Max shape has area " + maxShape.getClass().getSimpleName() + " - " + maxShape.getArea());

            System.out.println(
              "Square is: " + square.getArea()
        );
        System.out.println(
                "circle is: " + circle.getArea()
        );
        System.out.println(
                "Triangle is: " + triangle.getArea()
        );



    }


}
