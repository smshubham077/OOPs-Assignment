public class BookArrayDemo {
    public static void main(String[] args) {
        Book[] books = new Book[3];
        
        books[0] = new Book("Java Programming", "John Smith", 450.00);
        books[1] = new Book("Data Structures", "Jane Doe", 550.00);
        books[2] = new Book("Web Development", "Tom Wilson", 650.00);
        
        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}

class Book {
    String title;
    String author;
    double price;
    
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    
    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: Rs. " + price);
    }
}
