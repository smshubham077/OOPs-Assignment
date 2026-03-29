public class EmployeeCountDemo {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Alice", 101);
        Employee emp2 = new Employee("Bob", 102);
        Employee emp3 = new Employee("Charlie", 103);
        
        Employee.displayTotalEmployees();
    }
}

class Employee {
    String name;
    int id;
    static int employeeCount = 0;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }
    
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }
}
