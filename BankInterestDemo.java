public class BankInterestDemo {
    public static void main(String[] args) {
        Bank bank = new Bank();
        
        double amount1 = 5000;
        double amount2 = 10000;
        double amount3 = 15000;
        
        System.out.println("Customer 1 - Amount: " + amount1 + ", Interest: " + bank.calculateInterest(amount1));
        System.out.println("Customer 2 - Amount: " + amount2 + ", Interest: " + bank.calculateInterest(amount2));
        System.out.println("Customer 3 - Amount: " + amount3 + ", Interest: " + bank.calculateInterest(amount3));
    }
}

class Bank {
    final double interestRate = 5.5;
    
    double calculateInterest(double amount) {
        return (amount * interestRate) / 100;
    }
}
