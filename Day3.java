/*

Day 3 – Arrays & Loops
Review: array declaration, iteration, passing to methods.
Practice:
Generate an array of 20 random integers (1–100).
Find the min, max, and average.
Write a method reverseArray(int[] arr) that reverses the array in place.

*/

import java.util.Random; // Import the Random class to generate random numbers

public class Day3 {
    public static void main(String[] args) {
        // Let's start with Arrays
        // An array is a collection of items of the *same type* stored in a single variable.
        // In memory, an array is a contiguous block of memory locations. Each location holds one element of the array.
        // In Java, arrays are zero-indexed, meaning the first element is at index 0. The last element is at index length-1.
        // Arrays have a fixed size once they are created. You cannot change the size of an array after its creation.

        // To declare an array, you specify the type of elements it will hold, followed by square brackets [].
        int[] numbers; // Declaration of an array of integers
        String[] words; // Declaration of an array of strings

        // To create an array, you use the `new` keyword followed by the type and the number of elements in square brackets.
        numbers=new int[10]; // Creates an array that can hold 10 integers
        words=new String[5]; // Creates an array that can hold 5 strings

        // You can also declare and create an array in one line:
        int[] moreNumbers = new int[15]; // Creates an array that can hold 15 integers

        // To initialize an array with specific values, you can use curly braces {}:
        int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 }; // An array of the first ten prime numbers
        String[] fruits = { "Apple", "Banana", "Cherry", "Date" }; // An array of fruit names
        // Note: When you initialize an array with specific values, you do not need to specify the size; it is inferred from the number of values provided.

        // Accessing array elements is done using their index:
        int firstPrime = primes[0]; // Accessing the first element (2)
        String firstFruit = fruits[0]; // Accessing the first element ("Apple")
        int secondPrime = primes[1]; // Accessing the second element (3)
        String secondFruit = fruits[1]; // Accessing the second element ("Banana")

        // You can change the value of an array element by assigning a new value to a specific index:
        primes[0]=31; // Changing the first element to 31
        fruits[1]="Blueberry"; // Changing the second element to "Blueberry"

        // To find the length of an array, you can use the `.length` property:
        int numberOfPrimes = primes.length; // This will be 10
        int numberOfFruits = fruits.length; // This will be 4
        // Note: The length property is not a method, so you do not use parentheses.

        // Iterating over an array can be done using a for loop:
        for(int i = 0; i<primes.length; i++) {
            System.out.println("Prime number at index " + i + ": " + primes[i]);
        }
        
        // You can also use an enhanced for loop (for-each loop) to iterate over an array:
        for (int prime : primes) {
            System.out.println("Prime number: " + prime);
        }
        
        // Practice: Generate an array of 20 random integers (1–100).
        int[] randomNumbers = generateRandomArray(20, 1, 100);
        System.out.println("Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        // Find the min, max, and average.
        int min = findMin(randomNumbers);
        int max = findMax(randomNumbers);
        double average = findAverage(randomNumbers);
        System.out.println("\nMin: " + min);
        System.out.println("Max: " + max);
        System.out.println("Average: " + average);

        // Write a method reverseArray(int[] arr) that reverses the array in place.
        System.out.println("Reversing the array...");
        reverseArray(randomNumbers);
        System.out.println("Reversed Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
    }

    // Iteration is the process of looping through each element in a collection, such as an array, to perform operations on each element.
    // Iteration can be done on many different data structures, including arrays, lists, and sets.
    // The most common way to iterate over an array is using a for loop, as shown above.

    // Let's work on the practice problems:

    public static int[] generateRandomArray(int size, int min, int max) {
        Random rand = new Random(); // Create a Random object
        int[] arr = new int[size]; // Create an array of the specified size
        for (int i = 0; i < size; i++) { // Loop through each index of the array
            arr[i] = rand.nextInt(max - min + 1) + min; // Generate a random integer between min and max (inclusive)
        }
        return arr; // Return the generated array
    }

    public static int findMin(int[] arr) {
        int min = arr[0]; // Assume the first element is the minimum
        for (int num : arr) { // Iterate through each element in the array
            if (num < min) { // If the current element is less than the current minimum
                min = num; // Update the minimum
            }
        }
        return min; // Return the minimum value found
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum
        for (int num : arr) { // Iterate through each element in the array
            if (num > max) { // If the current element is greater than the current maximum
                max = num; // Update the maximum
            }
        }
        return max; // Return the maximum value found
    }

    public static double findAverage(int[] arr) {
        int sum = 0; // Initialize sum to 0
        for (int num : arr) { // Iterate through each element in the array
            sum += num; // Add the current element to the sum
        }
        return (double) sum / arr.length; // Return the average (sum divided by the number of elements)
    }

    public static void reverseArray(int[] arr) {
        int left = 0; // Start pointer
        int right = arr.length - 1; // End pointer
        while (left < right) { // Continue until the pointers meet in the middle
            // Swap the elements at the left and right pointers
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; // Move the left pointer to the right
            right--; // Move the right pointer to the left
        }
    }
}