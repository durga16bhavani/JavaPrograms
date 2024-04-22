package Day123assignments;

import java.util.Arrays;


public class Task7a{

    public static void main(String[] args) {
        int[] array = {56,23,12,78,10,99,60,1,100};
        System.out.println("Original Array: " + Arrays.toString(array));
        bruteForceSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }

    // Brute force sorting algorithm
    public static void bruteForceSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
