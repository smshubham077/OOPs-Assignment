import java.util.Scanner;

class Employee {
    private int empNo;
    private String empName;
    private double basic;
    private double hra;
    private double da;
    private double netpay;
    
    public Employee(int empNo, String empName, double basic) {
        this.empNo = empNo;
        this.empName = empName;
        this.basic = basic;
        this.hra = 0;
        this.da = 0;
        this.netpay = 0;
    }
    
    public void calculate() {
        hra = basic * 0.10;
        da = basic * 0.05;
        netpay = basic + hra + da;
    }
    
    public static Employee havedata() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee Number: ");
        int empNo = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        
        System.out.print("Enter Basic Salary (Rs): ");
        double basic = sc.nextDouble();
        
        return new Employee(empNo, empName, basic);
    }
    
    public void dispdata() {
        System.out.println("\n========== EMPLOYEE SALARY SLIP ==========");
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic Salary: Rs " + String.format("%.2f", basic));
        System.out.println("HRA (10%): Rs " + String.format("%.2f", hra));
        System.out.println("DA (5%): Rs " + String.format("%.2f", da));
        System.out.println("----------------------------------------");
        System.out.println("Net Pay: Rs " + String.format("%.2f", netpay));
        System.out.println("==========================================\n");
    }
}

public class EmployeeDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Employee Salary Calculator ===\n");
        
        Employee emp = Employee.havedata();
        emp.calculate();
        emp.dispdata();
        
        System.out.println("=== Demo Complete ===");
    }
}
