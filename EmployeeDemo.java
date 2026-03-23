// File: EmployeeDemo.java

import java.util.Scanner;

// Employee class
class Employee {
    int empno;       // Employee number
    String ename;    // Employee name
    float basic;     // Basic pay
    float hra;       // HRA
    float da;        // DA
    float netpay;    // Net pay

    // Calculate method: returns net pay (basic + hra + da)
    float calculate() {
        return basic + hra + da;
    }

    // havedata method: accept employee details and calculate netpay
    void havedata() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Number: ");
        empno = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Employee Name: ");
        ename = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        basic = sc.nextFloat();

        System.out.print("Enter HRA: ");
        hra = sc.nextFloat();

        System.out.print("Enter DA: ");
        da = sc.nextFloat();

        // Calculate netpay
        netpay = calculate();
    }

    // dispdata method: display all employee details
    void dispdata() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Pay: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}

// Main class
public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Input employee data
        emp.havedata();

        // Display employee data
        emp.dispdata();
    }
}