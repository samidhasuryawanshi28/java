// Base class
class Staff {
    void work() {
        System.out.println("Staff member is working.");
    }
}

// Subclass Doctor
class Doctor extends Staff {
    void work() {
        System.out.println("Doctor is diagnosing patients and prescribing treatment.");
    }
}

// Subclass Nurse
class Nurse extends Staff {
    void work() {
        System.out.println("Nurse is assisting doctors and caring for patients.");
    }
}

// Subclass Receptionist
class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist is managing appointments and patient records.");
    }
}

// Main class
public class HospitalStaff {
    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}