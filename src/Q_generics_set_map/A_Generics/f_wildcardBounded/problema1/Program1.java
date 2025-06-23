package Q_generics_set_map.A_Generics.f_wildcardBounded.problema1;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Circle(2.0));
        myShapes.add(new Rectangle(3.0, 2.0));

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(5.0));
        myCircles.add(new Circle(3.0));

        System.out.println("Total Area: " + totalArea(myShapes));
        System.out.println("Total Area: " + totalArea(myCircles));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }

}

interface Shape {
    double area();
}

class Rectangle implements Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

