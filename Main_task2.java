package Day45assignments;

//Shape class
class Shape {
 // Method to calculate the area of the shape
 public double area() {
     return 0; // Default implementation for unknown shapes
 }
}

//Circle class extending Shape
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Overriding the area method for Circle
 @Override
 public double area() {
     return Math.PI * radius * radius;
 }
}

//Rectangle class extending Shape
class Rectangle extends Shape {
 private double width;
 private double height;

 // Constructor
 public Rectangle(double width, double height) {
     this.width = width;
     this.height = height;
 }

 // Overriding the area method for Rectangle
 @Override
 public double area() {
     return width * height;
 }
}

public class Main_task2 {
 public static void main(String[] args) {
     // Create Circle object
     Circle circle = new Circle(5);
     System.out.println("Area of Circle: " + circle.area());

     // Create Rectangle object
     Rectangle rectangle = new Rectangle(4, 6);
     System.out.println("Area of Rectangle: " + rectangle.area());
 }
}
