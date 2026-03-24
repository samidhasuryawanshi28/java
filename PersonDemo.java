// Base class
class Person {
    void role() {
        System.out.println("I am a person.");
    }
}

// Employee class inherits from Person
class Employee extends Person {
    @Override
    void role() {
        System.out.println("I am an employee.");
    }
}

// Manager class inherits from Employee (multilevel)
class Manager extends Employee {
    @Override
    void role() {
        System.out.println("I am a manager.");
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {

        // Person reference can point to any subclass
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        // Runtime polymorphism: calls appropriate overridden method
        p1.role();  // Person's role
        p2.role();  // Employee's role
        p3.role();  // Manager's role
    }
}