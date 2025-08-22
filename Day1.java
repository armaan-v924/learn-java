import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        /* --- Variable Declaration and Initialization --- */
        // Variables are used to store data in memory. They must be declared with a type before they can be used.

        int x; // Declaration of a variable named `x` of type `int`. It can hold integer values, but currently has no value.
        x = 5; // Initialization of `x` with the value 5. Now `x` holds the integer value 5.

        // You can also declare and initialize a variable in one line:
        int y = 10; // Declaration and initialization in one line. `y` is now defined as an integer, holding the value 10.


        /* --- PRIMITIVE TYPES --- */
        double decimalNumber = 5.0; // decimals use `float` or `double`. 
        int wholeNumber = 6; // int has a max value of 2,147,483,647. The `long` type can hold larger values.
        boolean isSomething = true; // boolean can be true or false.
        char singleCharacter = 'A'; // char is a single character enclosed in single quotes.
        // There are also byte (8 bits), short (16 bits), and long (64 bits) types for different ranges of integer values.

        /* --- NON-PRIMITIVE TYPES --- */
        String text = "Hello, World!"; // String is a sequence of characters and is a non-primitive type.
        // Other values like arrays, classes, and interfaces are also non-primitive types.

        /* --- OPERATORS --- */

        // Arithmetic Operations; these will also work with floats and doubles (among others).
        int sum = wholeNumber + 10; // Addition

        int difference = wholeNumber - 2; // Subtraction
        int product = wholeNumber * 3; // Multiplication

        int quotient = wholeNumber / 2; // Division; note that this will perform integer division if both operands are integers, truncating the result.
        double preciseQuotient = decimalNumber / 2.0; // For floating-point division, use double or float.

        int remainder = wholeNumber % 4; // Modulus operator gives the remainder of division

        // Comparison Operations
        // These operations return a boolean value (true or false).
        boolean isEqual = (wholeNumber == 6); // Equality operator
        boolean isNotEqual = (wholeNumber != 5); // Not equal operator
        boolean isGreater = (wholeNumber > 5); // Greater than operator
        boolean isLess = (wholeNumber < 10); // Less than operator
        boolean isGreaterOrEqual = (wholeNumber >= 6); // Greater than or equal to operator
        boolean isLessOrEqual = (wholeNumber <= 6); // Less than or equal to operator

        // Logical Operations
        boolean notOperation = !isSomething; // Logical NOT, inverts the boolean value
        boolean andOperation = (isSomething && isEqual); // Logical AND, checks if both conditions are true
        boolean orOperation = (isSomething || isNotEqual); // Logical OR, checks if at least one condition is true
        boolean xorOperation = (isSomething ^ isEqual); // Logical XOR, true if one condition is true and the other is false

        // Bitwise Operations
        // We didn't go over this but these are used for operations on the actual binary representations of the data. 
        int x = 5; // Binary: 0101
        int y = 3; // Binary: 0011

        int bitwiseAnd = x & y; // Bitwise AND, results in 0001 (1 in decimal)
        int bitwiseOr = x | y; // Bitwise OR, results in 0111 (7 in decimal)
        int bitwiseXor = x ^ y; // Bitwise XOR, results in 0110 (6 in decimal)

        // Assignment Operations
        int assignment = 10; // Simple assignment
        assignment += 5; // Adds 5 to the current value (assignment = assignment + 5)
        assignment -= 3; // Subtracts 3 from the current value (assignment = assignment - 3)
        assignment *= 2; // Multiplies the current value by 2 (assignment = assignment * 2)
        assignment /= 4; // Divides the current value by 4 (assignment = assignment / 4)
        assignment %= 3; // Modulus operation (assignment = assignment % 3)

        // Unary Operations
        int unaryValue = 10;
        unaryValue++; // Increment operator, increases the value by 1 (unaryValue = unaryValue + 1)
        unaryValue--; // Decrement operator, decreases the value by 1 (unaryValue = unaryValue - 1)

        // User Input
        Scanner input = new Scanner(System.in); // Create a Scanner object to read input from the console
        /*
         * Breaking down the Scanner Creation:
         * 1. `Scanner` is a class in the `java.util` package.
         * 2. `input` is the name of the Scanner object.
         * 3. `new` is a keyword used to create a new instance of the Scanner class.
         * 4. `System.in` is the input stream that reads from the console.
         *    - `System` is a class that provides access to system resources.
         *   - `in` is a static field of the `System` class that represents the standard input stream (usually the keyboard).
         */
        
        System.out.print("Enter a number: "); // This sends some text to the console
        int userInput = input.nextInt(); // Reads an integer from user input
        System.out.println("You entered: " + userInput); // Outputs the user input. `println` automatically adds a new line after the output.
        input.close(); // Close the scanner to free resources (REALLY IMPORTANT TO CLOSE THE SCANNER ONCE YOU'RE DONE WITH IT)
    }
}
 