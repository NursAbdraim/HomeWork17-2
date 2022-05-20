package com.company;

public class Triangle extends Shape{
    public Triangle(int leg1, int leg2, int leg3){
        perimeter=(leg1+leg2+leg3);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of Triangle "+perimeter+" cm");
        return perimeter;
    }
}
