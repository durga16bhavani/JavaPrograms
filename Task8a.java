package Day123assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Task8a {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int len=array.length;
        System.out.println("The length of the array is:"+len);
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter start index:");
        int startIndex =sc.nextInt();
        System.out.printf("Enter end index:");
        int endIndex = sc.nextInt();
        int[] slicedArray = sliceArray(array, startIndex, endIndex);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Sliced Array: " + Arrays.toString(slicedArray));
    }

    // Method to slice the array from startIndex to endIndex
    public static int[] sliceArray(int[] array, int startIndex, int endIndex) {
        if (startIndex < 0 || endIndex >= array.length || startIndex > endIndex) {
            throw new IllegalArgumentException("Invalid start or end index");
        }
        int[] slicedArray = new int[endIndex - startIndex + 1];
        for (int i = startIndex; i <= endIndex; i++) {
            slicedArray[i - startIndex] = array[i];
        }
        return slicedArray;
    }
}

