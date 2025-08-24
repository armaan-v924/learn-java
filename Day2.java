/*
Day 2 – Methods & Parameters
Review: method syntax, return values, scope.
Practice:
Write a method int sumOfSquares(int n) that returns 1² + 2² + ... + n².

We'll also cover loops and control flow statements (if, switch, etc.).
*/

import java.util.Scanner; // Import the Scanner class to read input from the console

public class Day2 {
    // Let's write a new method
    public static int four() {
        return 4; // This method returns the integer 4
    }

    /*
     Breaking down the method declaration:
        1. `public`: This is an access modifier that means this method can be called from outside its class (this file) 
        2. `static`: This means the method belongs to the class itself rather than to instances of the class. You can call this method without creating an object of the class. We'll cover this more when we discuss classes and objects.
        3. `int`: This is the return type of the method, indicating that this method will return an integer value.
        4. `four`: This is the name of the method. Method names should be descriptive and typically use camelCase.
        5. `()`: These parentheses indicate that this method does not take any parameters. If it did, the parameters would be listed here.
        6. `{ ... }`: The curly braces enclose the body of the method, which contains the code that will be executed when the method is called.
     */

    public static int sumOfSquares(int n) {
        int sum = 0; // Initialize sum to 0
        for (int i = 1; i <= n; i++) { // Loop from 1 to n
            sum += i * i; // Add the square of i to sum
        }
        return sum; // Return the final sum
    }

    /*
        Breaking down the method declaration:
            1. `public`: This is an access modifier that means this method can be called from outside its class (this file) 
            2. `static`: This means the method belongs to the class itself rather than to instances of the class. You can call this method without creating an object of the class. We'll cover this more when we discuss classes and objects.
            3. `int`: This is the return type of the method, indicating that this method will return an integer value.
            4. `sumOfSquares`: This is the name of the method. Method names should be descriptive and typically use camelCase.
            5. `(int n)`: These parentheses indicate that this method takes one parameter, an integer named n. Parameters are used to pass values into methods.
            6. `{ ... }`: The curly braces enclose the body of the method, which contains the code that will be executed when the method is called.
     */

    public static void main(String[] args) {
        // Call the four method and print the result
        System.out.println("The method four() returns: " + four());

        // Call the sumOfSquares method with an example value and print the result
        int n = 5; // Example value
        System.out.println("The sum of squares from 1 to " + n + " is: " + sumOfSquares(n));

        // Scope!
        int outerVariable = 10; // This variable is in the scope of the main method. It only exists in this method.
        if (outerVariable > 5) {
            int innerVariable = 20; // This variable is in the scope of the if block. It only exists within this block (between the curly braces).
            System.out.println("Inner Variable: " + innerVariable); // This works
            System.out.println("Outer Variable from inside if block: " + outerVariable); // This also works
        }

        // System.out.println("Inner Variable from outside if block: " + innerVariable); // This would cause an error because innerVariable is not in scope here

        // Control Flow Statements
        /* 
            Control flow statements allow you to control the execution of your code based on certain conditions.
            The most common control flow statements are `if`, `else if`, `else`, and `switch`.
         */
        
        int number = 7;
        if (number < 5) {
            // This block executes if the condition is true
            System.out.println(number + " is less than 5");
        } else if (number == 5) {
            // This block executes if the previous condition was false and this condition is true
            System.out.println(number + " is equal to 5");
        } else {
            // This block executes if all previous conditions were false
            System.out.println(number + " is greater than 5");
        }

        /*
         Breaking down the if-else statement:
            1. `if (condition) { ... }`: The code inside the curly braces executes if the condition is true.
            2. `else if (condition) { ... }`: This is optional and can be used to check another condition if the previous `if` was false.
            3. `else { ... }`: This is also optional and executes if all previous conditions were false.
        
            The conditions inside the parentheses are boolean expressions that evaluate to true or false.
         */

        // Switch statement example
        int day = 3;
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break; // Break exits the switch statement
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default: // This block executes if none of the cases match
                dayName = "Invalid day";
                break;
        }

        System.out.println("Day " + day + " is " + dayName);
        /*
         Breaking down the switch statement:
            1. `switch (variable) { ... }`: The variable is evaluated once, and its value is compared against the values in each `case`.
            2. `case value: ... break;`: If the variable matches the value, the code inside this case executes until a `break` statement is encountered.
            3. `default: ... break;`: This is optional and executes if none of the cases match. It acts like the `else` in an if-else statement.
         */
     }


}