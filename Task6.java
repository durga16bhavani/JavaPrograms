package Day123assignments;

public class Task6 {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5,6};

        // Calculate the sum of elements in the array using the recursive function
        int sum = sumArray(array);

        // Print the result
        System.out.println("Sum of elements in the array: " + sum);
    }

    public static int sumArray(int[] arr) {
        return sumArrayRecursive(arr, 0);
    }

    private static int sumArrayRecursive(int[] arr, int index) {
        // Base case: if index reaches the end of the array, return 0
        if (index >= arr.length) {
            return 0;
        }

        // Recursive case: add the current element to the sum of the rest of the array
        return arr[index] + sumArrayRecursive(arr, index + 1);
    }
}
