abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Credit Card payment processed for 	2" + amount);
    }
}

class UPIPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("UPI payment processed for 	2" + amount);
    }
}

class NetBankingPayment extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Net Banking payment processed for 	2" + amount);
    }
}

public class PaymentDemo {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new UPIPayment(),
            new NetBankingPayment()
        };

        double amount = 1500.0;
        for (Payment p : payments) {
            p.pay(amount);
        }
    }
}
