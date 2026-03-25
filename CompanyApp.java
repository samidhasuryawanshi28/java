class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void showCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class CompanyApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rahul", 1);
        Employee emp2 = new Employee("Sneha", 2);
        Employee emp3 = new Employee("Amit", 3);
        Employee emp4 = new Employee("Neha", 4);

        Employee.showCount();
    }
}