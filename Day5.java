/*
Day 5 – Strings & Built-in Classes
Review: String methods (.substring, .equals, .compareTo), Math, wrappers.
Practice:
Write a program that checks if a word is a palindrome.
Use Math.random() to simulate rolling two dice 1,000 times and count how often you roll doubles.
 */

public class Day5 {
    public static void main(String[] args) {
        // Let's do Strings
        // A String is a sequence of characters. In Java, strings are objects that belong to the String class.
        // Since Strings are used so often, Java provides special support for them, allowing you to create and manipulate strings easily.
        String example = "Hello, World!"; // Creating a String object. Notice: you don't use 'new' keyword here, but you can.
        String anotherExample = new String("Hello, Java!"); // Creating a String object using 'new' keyword.

        System.out.println("Example String: " + example);
        System.out.println("Another Example String: " + anotherExample);

        // Common String methods
        // 1. length() - returns the length of the string
        System.out.println("Length of example string: " + example.length());

        // 2. substring(int beginIndex, int endIndex) - returns a new string that is a substring of this string
        // This method extracts characters from index beginIndex to endIndex-1.
        System.out.println("Substring of example string (0 to 5): " + example.substring(0, 5)); // Outputs "Hello"

        // 3. equals(Object anObject) - compares this string to the specified object (you'd use this instead of '==' for Strings)
        System.out.println("Is example equal to anotherExample? " + example.equals(anotherExample)); // Outputs false

        // 4. compareTo(String anotherString) - compares two strings lexicographically
        // If the first string is lexicographically (alphabetically but a little more complex) less than the second string, it returns a negative integer.
        // If the first string is lexicographically greater than the second string, it returns a positive integer.
        // If the strings are equal, it returns 0.
        System.out.println("Comparing example to anotherExample: " + example.compareTo(anotherExample));

        // 5. toLowerCase() and toUpperCase() - convert the string to lower case or upper case
        System.out.println("Lowercase example: " + example.toLowerCase());
        System.out.println("Uppercase example: " + example.toUpperCase());

        // ... and many more methods are available in the String class. You can check the official documentation for a full list.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        // ! Important: Read the documentation. There are many useful methods in the String class, and you need to know how to read official docs.

        // Ok Math time
        // The Math class provides methods for performing basic numeric operations such as exponentiation, logarithms, square roots, and trigonometric functions.
        // All methods in the Math class are static, so you can call them directly using the class name without creating an instance of the class.
        // https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html // Official documentation

        // Common Math methods
        // 1. abs(double a) - returns the absolute value of a number
        System.out.println("Absolute value of -10: " + Math.abs(-10)); // Outputs 10

        // 2. max(double a, double b) - returns the greater of two values
        System.out.println("Max of 10 and 20: " + Math.max(10, 20)); // Outputs 20

        // 3. min(double a, double b) - returns the smaller of two values
        System.out.println("Min of 10 and 20: " + Math.min(10, 20)); // Outputs 10

        // 4. pow(double a, double b) - returns the value of the first argument raised to the power of the second argument
        System.out.println("2 raised to the power of 3: " + Math.pow(2, 3)); // Outputs 8.0

        // 5. sqrt(double a) - returns the square root of a number
        System.out.println("Square root of 16: " + Math.sqrt(16)); // Outputs 4.0   

        // 6. random() - returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());
        // There are many more methods in the Math class. Check the official documentation for a full list.
    }

    // Practice 1: Write a program that checks if a word is a palindrome.
    // Using two pointers technique
    public static boolean isPalindrome(String word) {
        int left = 0; // Pointer starting from the beginning of the string
        int right = word.length() - 1; // Pointer starting from the end of the string

        while (left < right) { // Continue until the two pointers meet in the middle
            if (word.charAt(left) != word.charAt(right)) { // Compare characters at the two pointers
                return false; // If they don't match, it's not a palindrome
            }
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }
        return true; // If all characters matched, it's a palindrome
    }

    // Practice 2: Use Math.random() to simulate rolling two dice 1,000 times and count how often you roll doubles.
    public static void rollDiceSimulation(int rolls) {
        int doublesCount = 0; // Counter for doubles

        for (int i = 0; i < rolls; i++) { // Loop for the number of rolls
            int die1 = (int) (Math.random() * 6) + 1; // Roll the first die (1-6)
            int die2 = (int) (Math.random() * 6) + 1; // Roll the second die (1-6)

            if (die1 == die2) { // Check if the two dice are the same
                doublesCount++; // Increment the counter if they are doubles
            }
        }

        System.out.println("Number of doubles rolled in " + rolls + " rolls: " + doublesCount);
    }
}
