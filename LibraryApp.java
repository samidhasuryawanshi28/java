class Book {
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void display() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : " + price);
        System.out.println("------------------------");
    }
}

public class LibraryApp {
    public static void main(String[] args) {
        // Create array of Book objects
        Book[] books = new Book[3];

        books[0] = new Book("Java Basics", "James Gosling", 500);
        books[1] = new Book("Python Guide", "Guido van Rossum", 650);
        books[2] = new Book("C++ Primer", "Bjarne Stroustrup", 700);

        // Display all book details
        for (int i = 0; i < books.length; i++) {
            books[i].display();
        }
    }
}