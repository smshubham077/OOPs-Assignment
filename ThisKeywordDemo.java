public class ThisKeywordDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 60000);
        
        emp1.displayDetails();
        emp2.displayDetails();
    }
}

class Employee {
    String name;
    double salary;
    
    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    
    void displayDetails() {
        System.out.println("Employee Name: " + this.name + ", Salary: Rs. " + this.salary);
    }
}
