package Day123assignments;

import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        boolean isPrime = true;

        // Check if the number is divisible by any number other than 1 and itself
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <=num/2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        // Print whether the number is prime or not
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}

