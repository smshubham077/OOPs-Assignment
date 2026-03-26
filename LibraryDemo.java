import java.util.ArrayList;
import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getISBN() {
        return isbn;
    }
    
    @Override
    public String toString() {
        return "Title: " + title + " | Author: " + author + " | ISBN: " + isbn;
    }
}

class Library {
    private ArrayList<Book> books;
    
    public Library() {
        this.books = new ArrayList<>();
    }
    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("✓ Book added: " + book.getTitle());
    }
    
    public void removeBook(String title) {
        boolean found = false;
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                System.out.println("✓ Book removed: " + books.get(i).getTitle());
                books.remove(i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("✗ Book not found: " + title);
        }
    }
    
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Library is empty!");
            return;
        }
        System.out.println("\n--- Books in Library ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.println((i + 1) + ". " + books.get(i));
        }
    }
}

public class LibraryDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library library = new Library();
        
        System.out.println("=== Library Management System ===\n");
        
        library.addBook(new Book("Java Programming", "Herbert Schildt", "978-0134685991"));
        library.addBook(new Book("Data Structures", "Mark Allen Weiss", "978-0133373639"));
        library.addBook(new Book("The Clean Code", "Robert Martin", "978-0132350884"));
        
        library.displayBooks();
        
        System.out.println("\nRemoving 'Data Structures'...");
        library.removeBook("Data Structures");
        
        library.displayBooks();
        
        System.out.println("\n=== Demo Complete ===");
        sc.close();
    }
}
