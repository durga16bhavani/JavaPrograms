package Day123assignments;

public class Task2 {
	  public static void main(String[] args) {
	        // Check if there are three command-line arguments (operation, operand1, operand2)
	        if (args.length != 3) {
	            System.out.println("Usage: java SimpleCalculator <operation> <operand1> <operand2>");
	            return;
	        }

	        // Parse command-line arguments
	        String operation = args[0];
	        double operand1 = Double.parseDouble(args[1]);
	        double operand2 = Double.parseDouble(args[2]);

	        // Perform the specified operation
	        double result = 0;
	        switch (operation) {
	            case "add":
	                result = operand1 + operand2;
	                break;
	            case "subtract":
	                result = operand1 - operand2;
	                break;
	            case "multiply":
	                result = operand1 * operand2;
	                break;
	            case "divide":
	                if (operand2 != 0) {
	                    result = operand1 / operand2;
	                } else {
	                    System.out.println("Error: Division by zero!");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Error: Invalid operation!");
	                return;
	        }

	        // Print the result
	        System.out.println("Result: " + result);
    }
	

}
