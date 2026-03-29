class Shape {
    void display() {
        System.out.println("Base Shape display method.");
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.println("Circle area (radius = " + radius + "): " + calculateArea());
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    @Override
    void display() {
        System.out.println("Rectangle area (width = " + width + ", height = " + height + "): " + calculateArea());
    }
}

public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        circle.display();
        rectangle.display();
    }
}
