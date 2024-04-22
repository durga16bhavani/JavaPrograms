package Day123assignments;

import java.util.Scanner;

public class Task7b {

    public static void main(String[] args) {
        int[] array = {12, 45, 67, 23, 56, 89, 34, 78};
        Scanner x= new Scanner(System.in);
        System.out.printf("Enter the element to found:");
        int target=x.nextInt();
     
        int index = performLinearSearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }

    // Function to perform linear search
    public static int performLinearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return index
            }
        }
        return -1; // Element not found
    }
}
