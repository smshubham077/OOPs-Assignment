public class PersonDemo {
    private String name;
    private int age;
    
    public PersonDemo(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
    
    public static void main(String[] args) {
        System.out.println("=== Person Demo ===\n");
        
        PersonDemo person1 = new PersonDemo("John Doe", 25);
        person1.displayInfo();
        
        PersonDemo person2 = new PersonDemo("Jane Smith", 30);
        person2.displayInfo();
        
        System.out.println("\n=== Demo Complete ===");
    }
}
