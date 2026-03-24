// Abstract base class
abstract class Payment {
    abstract void pay(double amount);  // Abstract method
}

// Credit Card Payment
class CreditCardPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

// UPI Payment
class UPIPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

// Net Banking Payment
class NetBankingPayment extends Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Net Banking.");
    }
}

// Main class
public class PaymentDemo {
    public static void main(String[] args) {

        Payment p1 = new CreditCardPayment();
        Payment p2 = new UPIPayment();
        Payment p3 = new NetBankingPayment();

        p1.pay(500);
        p2.pay(1500);
        p3.pay(2000);
    }
}