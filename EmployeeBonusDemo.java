abstract class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    String getName() {
        return name;
    }

    int getId() {
        return id;
    }

    double getSalary() {
        return salary;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    Manager(String name, int id, double salary) {
        super(name, id, salary);
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.20;
    }
}

class Developer extends Employee {
    private double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }

    @Override
    double calculateBonus() {
        return getSalary() * 0.10 + projectIncentive;
    }
}

public class EmployeeBonusDemo {
    public static void main(String[] args) {
        Employee[] staff = {
            new Manager("Alice", 101, 80000),
            new Developer("Bob", 102, 60000, 5000)
        };

        for (Employee e : staff) {
            System.out.println(e.getClass().getSimpleName()
                    + " " + e.getName()
                    + " (ID:" + e.getId() + ") bonus: 	2" + e.calculateBonus());
        }
    }
}
