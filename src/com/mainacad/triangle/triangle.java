package com.mainacad.triangle;

import com.mainacad.abs.AbstractShape;
import com.mainacad.abs.Shape;

public class triangle extends AbstractShape {
        private double side1;
        private double side2;
        private double side3;
        private double PoluPerimetr;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    @Override
    public double getArea(){
        PoluPerimetr = (side1+side2+side3)/2;
        return Math.sqrt(PoluPerimetr*(PoluPerimetr-side1)*(PoluPerimetr-side2)*(PoluPerimetr-side3));
    }
}
