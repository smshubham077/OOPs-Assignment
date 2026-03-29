class Person {
    void role() {
        System.out.println("Role: General person.");
    }
}

class EmployeePerson extends Person {
    @Override
    void role() {
        System.out.println("Role: Employee.");
    }
}

class ManagerPerson extends EmployeePerson {
    @Override
    void role() {
        System.out.println("Role: Manager.");
    }
}

public class PersonHierarchyDemo {
    public static void main(String[] args) {
        Person[] people = {
            new Person(),
            new EmployeePerson(),
            new ManagerPerson()
        };

        for (Person p : people) {
            p.role();
        }
    }
}
