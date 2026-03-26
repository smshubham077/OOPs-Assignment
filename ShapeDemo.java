abstract class Shape {
    protected String shapeType;
    
    public abstract double calculate_area();
    
    public void display_info() {
        System.out.println("Shape Type: " + shapeType);
        System.out.println("Area: " + calculate_area());
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.shapeType = "Circle";
        this.radius = radius;
    }
    
    @Override
    public double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends Shape {
    private double length;
    private double width;
    
    public RectangleShape(double length, double width) {
        this.shapeType = "Rectangle";
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculate_area() {
        return length * width;
    }
}

public class ShapeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Shape Demo - Abstraction & Polymorphism ===\n");
        
        Shape circle = new Circle(5.0);
        System.out.println("--- Circle Information ---");
        circle.display_info();
        System.out.println();
        
        Shape rectangle = new RectangleShape(6.0, 4.0);
        System.out.println("--- Rectangle Information ---");
        rectangle.display_info();
        System.out.println();
        
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(3.0);
        shapes[1] = new RectangleShape(5.0, 7.0);
        
        System.out.println("--- All Shapes ---");
        for (Shape shape : shapes) {
            shape.display_info();
            System.out.println();
        }
        
        System.out.println("=== Demo Complete ===");
    }
}
