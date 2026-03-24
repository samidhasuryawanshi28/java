// Abstract base class
abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract void calculateBonus();
}

// Manager subclass
class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    void calculateBonus() {
        double bonus = salary * 0.20; // 20% of salary
        System.out.println("Manager " + name + " (ID: " + id + ") Bonus: " + bonus);
    }
}

// Developer subclass
class Developer extends Employee {
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }

    @Override
    void calculateBonus() {
        double bonus = (salary * 0.10) + projectIncentive; // 10% salary + incentive
        System.out.println("Developer " + name + " (ID: " + id + ") Bonus: " + bonus);
    }
}

// Main class
public class EmployeePerformance {
    public static void main(String[] args) {

        // Employee references pointing to subclass objects
        Employee emp1 = new Manager("Alice", 101, 50000);
        Employee emp2 = new Developer("Bob", 102, 40000, 5000);

        // Runtime polymorphism
        emp1.calculateBonus();
        emp2.calculateBonus();
    }
}