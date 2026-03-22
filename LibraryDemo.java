// File: LibraryDemo.java

import java.util.ArrayList;

// Book class represents a single book
class Book {
    String title;
    String author;
    String isbn;

    // Constructor to initialize book details
    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
    }
}

// Library class manages a collection of Book objects
class Library {
    ArrayList<Book> books = new ArrayList<>();

    // Add a new book to the library
    void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.title);
    }

    // Remove a book from the library by ISBN
    void removeBook(String isbn) {
        boolean found = false;
        for (Book b : books) {
            if (b.isbn.equals(isbn)) {
                books.remove(b);
                System.out.println("Book removed with ISBN: " + isbn);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found with ISBN: " + isbn);
        }
    }

    // Display all available books in the library
    void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Library Books:");
            for (Book b : books) {
                b.display();
            }
        }
    }
}

// Main class to run the program
public class LibraryDemo {
    public static void main(String[] args) {

        // Create a library object
        Library lib = new Library();

        // Create book objects
        Book b1 = new Book("Java Basics", "James Gosling", "101");
        Book b2 = new Book("OOP Concepts", "Bjarne Stroustrup", "102");

        // Add books to the library
        lib.addBook(b1);
        lib.addBook(b2);

        // Display all books
        lib.displayBooks();

        // Remove a book by ISBN
        lib.removeBook("101");

        // Display books again to see updated list
        lib.displayBooks();
    }
}