import java.util.Scanner;

class Resort {
    private int roomNo;
    private String name;
    private double dailyCharges;
    private int days;
    private double totalAmount;
    
    public Resort(int roomNo, String name, double dailyCharges, int days) {
        this.roomNo = roomNo;
        this.name = name;
        this.dailyCharges = dailyCharges;
        this.days = days;
        this.totalAmount = 0;
    }
    
    public void compute() {
        totalAmount = dailyCharges * days;
        
        if (totalAmount > 11000) {
            double surcharge = totalAmount * 0.02;
            totalAmount += surcharge;
            System.out.println("Base Amount: Rs " + (totalAmount - surcharge));
            System.out.println("Surcharge (2%): Rs " + surcharge);
        }
    }
    
    public static Resort getInfo() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Guest Name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter Daily Charges (Rs): ");
        double dailyCharges = sc.nextDouble();
        
        System.out.print("Enter Number of Days: ");
        int days = sc.nextInt();
        
        return new Resort(roomNo, name, dailyCharges, days);
    }
    
    public void dispInfo() {
        System.out.println("\n========== RESORT BOOKING SUMMARY ==========");
        System.out.println("Room Number: " + roomNo);
        System.out.println("Guest Name: " + name);
        System.out.println("Daily Charges: Rs " + dailyCharges);
        System.out.println("Number of Days: " + days);
        System.out.println("Total Amount to Pay: Rs " + totalAmount);
        System.out.println("============================================\n");
    }
}

public class ResortDemo {
    
    public static void main(String[] args) {
        System.out.println("=== Resort Booking System ===\n");
        
        Resort resort = Resort.getInfo();
        resort.compute();
        resort.dispInfo();
        
        System.out.println("=== Demo Complete ===");
    }
}
