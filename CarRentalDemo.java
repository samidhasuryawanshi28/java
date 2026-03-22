// File: CarRentalDemo.java

import java.util.Scanner;

// CarRental class
class CarRental {
    int carId;
    String carType;
    float rent;

    // GetCar method: accepts carId and carType
    void getCar(int id, String type) {
        this.carId = id;
        this.carType = type;

        // Set rent based on car type
        getRent();
    }

    // GetRent method: sets rent based on car type
    void getRent() {
        switch (carType.toLowerCase()) {
            case "small car":
                rent = 1000;
                break;
            case "van":
                rent = 800;
                break;
            case "suv":
                rent = 2500;
                break;
            default:
                rent = 0;
                System.out.println("Invalid car type!");
        }
    }

    // ShowCar method: display car details
    void showCar() {
        System.out.println("Car ID: " + carId + ", Car Type: " + carType + ", Rent: " + rent);
    }
}

// Main class
public class CarRentalDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a CarRental object
        CarRental car1 = new CarRental();

        // Accept car details from user
        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Car Type (Small Car / Van / SUV): ");
        String type = sc.nextLine();

        // Set car details
        car1.getCar(id, type);

        // Display car details
        System.out.println("\nCar Details:");
        car1.showCar();

        sc.close();
    }
}