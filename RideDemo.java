// Abstract base class
abstract class Ride {
    double distance; // in kilometers

    Ride(double distance) {
        this.distance = distance;
    }

    // Abstract method to calculate fare
    abstract double calculateFare();
}

// BikeRide subclass
class BikeRide extends Ride {
    BikeRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 5; // ₹5 per km
    }
}

// AutoRide subclass
class AutoRide extends Ride {
    AutoRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 8; // ₹8 per km
    }
}

// CarRide subclass
class CarRide extends Ride {
    CarRide(double distance) {
        super(distance);
    }

    @Override
    double calculateFare() {
        return distance * 12; // ₹12 per km
    }
}

// Main class
public class RideDemo {
    public static void main(String[] args) {

        // Array of Ride references (runtime polymorphism)
        Ride[] rides = new Ride[3];
        rides[0] = new BikeRide(10);   // 10 km
        rides[1] = new AutoRide(15);   // 15 km
        rides[2] = new CarRide(20);    // 20 km

        // Calculate and display fares
        for (Ride ride : rides) {
            System.out.println(ride.getClass().getSimpleName() +
                               " Fare: ₹" + ride.calculateFare());
        }
    }
}