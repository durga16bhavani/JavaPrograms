package Day123assignments;

public class Task4 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers
        int[] numbers = new int[10]; // Assuming 10 consecutive numbers
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i + 1; // Consecutive numbers starting from 1
        }

        // Print the original array
        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // Print a newline

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
