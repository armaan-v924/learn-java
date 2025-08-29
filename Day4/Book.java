package Day4;

// Create a Book class with fields: title, author, price.
// Add a constructor, and methods getDiscountedPrice(double percent).

public class Book {
    private String title;
    private String author;
    private double price;
    
    // Default constructor
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Overloaded constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscountedPrice(double percent) {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Percent must be between 0 and 100");
        }
        return price * (1 - percent / 100);
    }
}
