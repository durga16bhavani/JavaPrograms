package Day123assignments;

public class Task1 {
	public static void main(String[] args) {
        // Declare two integer variables
        int a = 10;
        int b = 20;
        
        // Print original values
        System.out.println("Before swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // Swap values without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;
        
        // Print swapped values
        System.out.println("\nAfter swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
