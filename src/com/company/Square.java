package com.company;

public class Square extends Shape{
    public Square(int a){
        perimeter = (a * 4);
    }

    @Override
    public double getPerimeter(){
        System.out.println("Perimeter of Square "+perimeter+" cm");
        return perimeter;
    }
}
