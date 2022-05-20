package com.company;

public class Rectangle extends Shape{
    public Rectangle(int x, int y){
        perimeter = (x + y)* 2;
    }

    @Override
    public double getPerimeter() {
        System.out.println("Perimeter of Rectangle "+perimeter+" cm");
        return perimeter;
    }
}
