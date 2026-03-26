import java.util.Scanner;

class Rectangle {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double area() {
        return length * width;
    }
    
    public static Rectangle getInput() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Length of Rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter Width of Rectangle: ");
        double width = sc.nextDouble();
        
        return new Rectangle(length, width);
    }
    
    public void displayInfo() {
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area());
    }
}

public class RectangleDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Rectangle Area Calculator ===\n");
        
        System.out.println("Rectangle 1:");
        Rectangle rect1 = Rectangle.getInput();
        
        System.out.println("\nRectangle Information:");
        rect1.displayInfo();
        
        System.out.println("\n" + "=".repeat(35));
        
        System.out.println("\nRectangle 2:");
        Rectangle rect2 = Rectangle.getInput();
        
        System.out.println("\nRectangle Information:");
        rect2.displayInfo();
        
        System.out.println("\n" + "=".repeat(35));
        System.out.println("=== Demo Complete ===");
    }
}
