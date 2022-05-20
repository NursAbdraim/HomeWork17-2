package com.company;

public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(8, 8, 12);
        triangle.getPerimeter();

        Square square = new Square(4);
        square.getPerimeter();

        Rectangle rectangle = new Rectangle(6,8);
        rectangle.getPerimeter();

        Circle circle = new Circle(4, 3.14);
        circle.getPerimeter();

        Trapezoid trapezoid = new Trapezoid(3,5,3, 8);
        trapezoid.getPerimeter();
    }
}
