abstract class Shape {
    // Abstract method
    abstract double calculate_area();

    // Concrete method
    void display_info() {
        System.out.println("This is a shape.");
    }
}

// Circle subclass
class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    double calculate_area() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    double calculate_area() {
        return length * breadth;
    }
}

// Main class
public class TestShape {
    public static void main(String[] args) {

        // Shape s = new Shape(); // ❌ ERROR: Cannot instantiate abstract class

        // Using Circle
        Circle c = new Circle(3);
        c.display_info();  // calling concrete method
        System.out.println("Circle Area: " + c.calculate_area());

        // Using Rectangle
        Rectangle r = new Rectangle(4, 5);
        r.display_info();  // calling concrete method
        System.out.println("Rectangle Area: " + r.calculate_area());
    }
}