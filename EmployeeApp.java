class Employee {
    String name;
    double salary;

    // Constructor using 'this' keyword
    Employee(String name, double salary) {
        this.name = name;       // refers to current object variable
        this.salary = salary;
    }

    // Method to display details
    void display() {
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + salary);
        System.out.println("----------------------");
    }
}

public class EmployeeApp {
    public static void main(String[] args) {
        // Creating Employee objects
        Employee e1 = new Employee("Alice", 50000);
        Employee e2 = new Employee("Bob", 60000);

        // Display details
        e1.display();
        e2.display();
    }
}