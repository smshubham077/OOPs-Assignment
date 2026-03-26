import java.util.Scanner;

class CarRental {
    private String carType;
    private int days;
    private double rent;
    
    private static final double SMALL_CAR_RATE = 1000;
    private static final double VAN_RATE = 800;
    private static final double SUV_RATE = 2500;
    
    public void getCar() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Available Car Types:");
        System.out.println("1. Small Car (Rs 1000/day)");
        System.out.println("2. Van (Rs 800/day)");
        System.out.println("3. SUV (Rs 2500/day)");
        System.out.print("Enter your choice (1-3): ");
        
        int choice = sc.nextInt();
        
        switch (choice) {
            case 1:
                carType = "Small Car";
                break;
            case 2:
                carType = "Van";
                break;
            case 3:
                carType = "SUV";
                break;
            default:
                carType = "Small Car";
                System.out.println("Invalid choice! Default: Small Car");
        }
    }
    
    public void getRent() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of days: ");
        days = sc.nextInt();
        
        switch (carType) {
            case "Small Car":
                rent = SMALL_CAR_RATE * days;
                break;
            case "Van":
                rent = VAN_RATE * days;
                break;
            case "SUV":
                rent = SUV_RATE * days;
                break;
            default:
                rent = 0;
        }
    }
    
    public void showCar() {
        System.out.println("\n========== RENTAL DETAILS ==========");
        System.out.println("Car Type: " + carType);
        System.out.println("Number of Days: " + days);
        System.out.println("Total Rent: Rs " + rent);
        System.out.println("====================================\n");
    }
}

public class CarRentalDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Car Rental System ===\n");
        
        CarRental rental = new CarRental();
        
        rental.getCar();
        rental.getRent();
        rental.showCar();
        
        System.out.println("=== Demo Complete ===");
    }
}
