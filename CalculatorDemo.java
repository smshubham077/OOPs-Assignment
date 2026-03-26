import java.util.Scanner;

class Calculator {
    
    public int add(int a, int b) {
        System.out.println("Method called: add(int, int)");
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        System.out.println("Method called: add(int, int, int)");
        return a + b + c;
    }
    
    public double add(double a, double b) {
        System.out.println("Method called: add(double, double)");
        return a + b;
    }
    
    public int subtract(int a, int b) {
        System.out.println("Method called: subtract(int, int)");
        return a - b;
    }
    
    public double multiply(double a, double b) {
        System.out.println("Method called: multiply(double, double)");
        return a * b;
    }
    
    public double divide(double a, double b) {
        System.out.println("Method called: divide(double, double)");
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }
}

public class CalculatorDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        
        System.out.println("=== Calculator with Method Overloading ===\n");
        
        System.out.println("--- Testing add(int, int) ---");
        int result1 = calculator.add(10, 20);
        System.out.println("Result: " + result1 + "\n");
        
        System.out.println("--- Testing add(int, int, int) ---");
        int result2 = calculator.add(10, 20, 30);
        System.out.println("Result: " + result2 + "\n");
        
        System.out.println("--- Testing add(double, double) ---");
        double result3 = calculator.add(15.5, 24.5);
        System.out.println("Result: " + result3 + "\n");
        
        System.out.println("--- Testing subtract(int, int) ---");
        int result4 = calculator.subtract(50, 30);
        System.out.println("Result: " + result4 + "\n");
        
        System.out.println("--- Testing multiply(double, double) ---");
        double result5 = calculator.multiply(7.5, 4.0);
        System.out.println("Result: " + result5 + "\n");
        
        System.out.println("--- Testing divide(double, double) ---");
        double result6 = calculator.divide(100.0, 4.0);
        System.out.println("Result: " + result6 + "\n");
        
        System.out.println("=".repeat(40));
        System.out.println("Interactive Calculator\n");
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        System.out.println("\nCalculations:");
        System.out.println("Add: " + calculator.add(num1, num2));
        System.out.println("Subtract: " + calculator.subtract((int)num1, (int)num2));
        System.out.println("Multiply: " + calculator.multiply(num1, num2));
        System.out.println("Divide: " + calculator.divide(num1, num2));
        
        System.out.println("\n=== Demo Complete ===");
        sc.close();
    }
}
