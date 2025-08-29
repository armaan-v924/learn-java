package Day4;

/* Day 4 – Classes & Objects
Review: constructors, instance variables, getters/setters, this.
Practice:
        Create a Book class with fields: title, author, price.
        Add a constructor, and methods getDiscountedPrice(double percent).
        In main, create 3 books and print their discounted prices.
*/

public class Day4 {
    // Let's go over classes. Note: the practice problem will be solved in Day4/Book.java, but the main will be here

    // A class is a blueprint for creating objects. It defines the properties (attributes) and behaviors (methods) that the objects created from the class will have.
    // An object is an instance of a class. It is created based on the structure defined by the class.
    // An "instance" simply means a specific version of something. When you create an object from a class, you are creating an instance of that class.
    
    // To define a class, you use the `class` keyword followed by the class name (which should start with an uppercase letter) and curly braces {} to enclose the class body.
    // The class name must match the filename in Java.

    // Let's use this Day4 class as a sample.

    // Instance variables (also known as fields) are used to store the state of an object. They are defined within the class but outside any methods.
    private String name; // Instance variable to store the name of the Day4 object
    private int dayNumber; // Instance variable to store the day number

    private static int instanceCount = 0; // Static variable to keep track of the number of instances created.
    // Note: Static variables are shared among all instances of a class. There is only one copy of a static variable, regardless of how many objects are created from the class.

    // Note: these instance variables are private, meaning they cannot be accessed directly from outside the class. This is a common practice to encapsulate the data and protect it from unintended modifications.

    // A constructor is a special method that is called when an object is instantiated. It has the same name as the class and does not have a return type.
    public Day4(String name, int dayNumber) {
        this.name = name; // Using 'this' to refer to the instance variable
        this.dayNumber = dayNumber; // Using 'this' to refer to the instance variable
        instanceCount++; // Increment the instance count each time a new object is created
    }

    // Getters and setters are methods used to access and modify the private instance variables of a class.
    public String getName() {
        return name; // Getter for the name instance variable
    }

    public void setName(String name) {
        this.name = name; // Setter for the name instance variable
    }

    public int getDayNumber() {
        return dayNumber; // Getter for the dayNumber instance variable
    }

    public void setDayNumber(int dayNumber) {
        this.dayNumber = dayNumber; // Setter for the dayNumber instance variable
    }

    public static int getInstanceCount() {
        return instanceCount; // Static method to get the number of instances created
    } // Note: Static methods can be called without creating an instance of the class.

    public static void main(String[] args) {
        // Creating instances (objects) of the Day4 class
        Day4 dayOne = new Day4("Introduction to Classes", 1);
        Day4 dayTwo = new Day4("Constructors and This", 2);
        Day4 dayThree = new Day4("Getters and Setters", 3);

        // Accessing instance variables using getters
        System.out.println("Day 1: " + dayOne.getName() + " (Day Number: " + dayOne.getDayNumber() + ")");
        System.out.println("Day 2: " + dayTwo.getName() + " (Day Number: " + dayTwo.getDayNumber() + ")");
        System.out.println("Day 3: " + dayThree.getName() + " (Day Number: " + dayThree.getDayNumber() + ")");

        // Modifying instance variables using setters
        dayOne.setName("Basics of Classes");
        System.out.println("Updated Day 1: " + dayOne.getName());

        // Accessing the static variable using the static method
        System.out.println("Total instances created: " + Day4.getInstanceCount());

        // Let's now use the Book class created in Day4/Book.java
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("1984", "George Orwell", 8.99);
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 12.49);

        System.out.println("Discounted price of '" + book1.getTitle() + "': $" + book1.getDiscountedPrice(15));
        System.out.println("Discounted price of '" + book2.getTitle() + "': $" + book2.getDiscountedPrice(20));
        System.out.println("Discounted price of '" + book3.getTitle() + "': $" + book3.getDiscountedPrice(10));
    }
}