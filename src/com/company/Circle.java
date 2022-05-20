package com.company;

public class Circle extends Shape{
    public Circle(int radius, double PI){
        perimeter = (int) (2 * radius * PI);
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of Circle "+perimeter+" cm");
        return perimeter;
    }
}
