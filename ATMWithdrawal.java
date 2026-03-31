import java.util.Scanner;

public class ATMWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Balance: ");
            double balance = sc.nextDouble();

            System.out.print("Enter Withdrawal Amount: ");
            double amount = sc.nextDouble();

            if (amount > balance) {
                throw new Exception("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}