import java.util.Scanner;

interface Bank {
    double getInterestRate();
    String getBankName();
}

class SBI implements Bank {
    
    @Override
    public double getInterestRate() {
        return 7.0;
    }
    
    @Override
    public String getBankName() {
        return "State Bank of India (SBI)";
    }
}

class HDFC implements Bank {
    
    @Override
    public double getInterestRate() {
        return 6.5;
    }
    
    @Override
    public String getBankName() {
        return "Housing Development Finance Corporation (HDFC)";
    }
}

class ICICI implements Bank {
    
    @Override
    public double getInterestRate() {
        return 6.75;
    }
    
    @Override
    public String getBankName() {
        return "Industrial Credit and Investment Corporation of India (ICICI)";
    }
}

public class BankDemo {
    
    public static void calculateInterest(Bank bank, double principal, int years) {
        double rate = bank.getInterestRate();
        double simpleInterest = (principal * rate * years) / 100;
        double totalAmount = principal + simpleInterest;
        
        System.out.println("\n========== INTEREST CALCULATION ==========");
        System.out.println("Bank: " + bank.getBankName());
        System.out.println("Principal Amount: Rs " + principal);
        System.out.println("Interest Rate: " + rate + "% per annum");
        System.out.println("Number of Years: " + years);
        System.out.println("-----------------------------------------");
        System.out.println("Simple Interest: Rs " + String.format("%.2f", simpleInterest));
        System.out.println("Total Amount: Rs " + String.format("%.2f", totalAmount));
        System.out.println("==========================================");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Bank Interest Calculator ===\n");
        
        System.out.print("Enter Principal Amount (Rs): ");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();
        
        System.out.println("\n--- Interest Rates Comparison ---");
        
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();
        
        calculateInterest(sbi, principal, years);
        calculateInterest(hdfc, principal, years);
        calculateInterest(icici, principal, years);
        
        System.out.println("\n--- All Banks Overview ---");
        Bank[] banks = {sbi, hdfc, icici};
        
        System.out.println("\nBank Name                                          Interest Rate");
        System.out.println("-".repeat(70));
        for (Bank bank : banks) {
            System.out.printf("%-50s %6.2f%%\n", bank.getBankName(), bank.getInterestRate());
        }
        
        System.out.println("\n=== Demo Complete ===");
        sc.close();
    }
}
