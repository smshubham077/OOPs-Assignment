public class StaffDemo {
    public static void main(String[] args) {
        Staff doctor = new Doctor("Dr. Smith");
        Staff nurse = new Nurse("Nurse Johnson");
        Staff receptionist = new Receptionist("Ms. Brown");
        
        doctor.work();
        nurse.work();
        receptionist.work();
    }
}

abstract class Staff {
    String name;
    
    Staff(String name) {
        this.name = name;
    }
    
    abstract void work();
}

class Doctor extends Staff {
    Doctor(String name) {
        super(name);
    }
    
    void work() {
        System.out.println(name + " is examining patients");
    }
}

class Nurse extends Staff {
    Nurse(String name) {
        super(name);
    }
    
    void work() {
        System.out.println(name + " is assisting the doctor");
    }
}

class Receptionist extends Staff {
    Receptionist(String name) {
        super(name);
    }
    
    void work() {
        System.out.println(name + " is managing appointments");
    }
}
