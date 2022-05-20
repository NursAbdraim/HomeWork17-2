package com.company;

public class Trapezoid extends Shape{
    public Trapezoid(int e, int f, int g, int h){
        perimeter = (e + f + g +h);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of Trapezoid "+perimeter+" cm");
        return 0;
    }
}
