// Define the Person class
class Person {
    String name;
    int age;

    // Constructor to initialize attributes
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class to test Person objects
public class Main {
    public static void main(String[] args) {
        // Create two Person objects
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person("Bob", 30);

        // Print their details
        p1.display();
        p2.display();
    }
}