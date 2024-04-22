package Day123assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Task8b{

    public static void main(String[] args) {
    	System.out.printf("Enter n value:");
    	Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] fibonacciSequence = new int[n];
        generateFibonacciSequence(fibonacciSequence, n);
        System.out.println("Fibonacci Sequence of length " + n + ": " + Arrays.toString(fibonacciSequence));

        int nthElement = findNthFibonacci(n);
        System.out.println("The " + n + "th element of Fibonacci sequence: " + nthElement);
    }

    // Function to generate the Fibonacci sequence of length n and store it in the array
    public static void generateFibonacciSequence(int[] sequence, int n) {
        if (n >= 1) {
            sequence[0] = 0;
        }
        if (n >= 2) {
            sequence[1] = 1;
        }
        for (int i = 2; i < n; i++) {
            sequence[i] = sequence[i - 1] + sequence[i - 2];
        }
    }

    // Recursive function to find the nth element of the Fibonacci sequence
    public static int findNthFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
    }
}
