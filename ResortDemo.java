// File: ResortDemo.java

import java.util.Scanner;

// Resort class
class Resort {
    int RNo;          // Room Number
    String Name;      // Customer Name
    float Charges;    // Per day charges
    int Days;         // Number of days of stay
    float Amount;     // Total amount

    // Getinfo method: input room details
    void getInfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Customer Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Number of Days: ");
        Days = sc.nextInt();

        // sc.close(); // Do NOT close Scanner here if using multiple objects
    }

    // Compute method: calculate total amount
    float compute() {
        float total = Days * Charges;

        if (total > 11000) {
            total = 1.02f * total; // Add 2% extra if total > 11000
        }

        Amount = total; // Store amount
        return Amount;
    }

    // DispInfo method: display details
    void dispInfo() {
        System.out.println("\n--- Resort Bill ---");
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per day: " + Charges);
        System.out.println("Number of Days: " + Days);
        System.out.println("Total Amount: " + compute());
    }
}

// Main class
public class ResortDemo {
    public static void main(String[] args) {
        Resort r = new Resort();

        // Input details
        r.getInfo();

        // Display details and amount
        r.dispInfo();
    }
}