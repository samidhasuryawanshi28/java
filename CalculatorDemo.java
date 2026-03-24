class Calculator {

    // Method with two integers
    int add(int a, int b) {
        System.out.println("Adding two integers:");
        return a + b;
    }

    // Method with three integers
    int add(int a, int b, int c) {
        System.out.println("Adding three integers:");
        return a + b + c;
    }

    // Method with two doubles
    double add(double a, double b) {
        System.out.println("Adding two doubles:");
        return a + b;
    }
}

public class CalculatorDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.add(5, 10);        // calls add(int, int)
        int result2 = calc.add(1, 2, 3);      // calls add(int, int, int)
        double result3 = calc.add(2.5, 3.5);  // calls add(double, double)

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
    }
}