class Bank {
    // final interest rate (fixed)
    final double interestRate;

    // Constructor to initialize interest rate
    Bank(double interestRate) {
        this.interestRate = interestRate;
    }

    // Method to calculate interest
    double calculateInterest(double amount) {
        return amount * interestRate / 100;
    }
}

public class BankApp {
    public static void main(String[] args) {
        // Create bank object with fixed interest rate
        Bank bank = new Bank(5.0); // 5% interest rate

        // Different customers' amounts
        double customer1 = 1000;
        double customer2 = 2500;
        double customer3 = 5000;

        // Calculate and display interest
        System.out.println("Customer 1 Interest: " + bank.calculateInterest(customer1));
        System.out.println("Customer 2 Interest: " + bank.calculateInterest(customer2));
        System.out.println("Customer 3 Interest: " + bank.calculateInterest(customer3));
    }
}