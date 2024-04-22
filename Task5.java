package Day123assignments;

import java.util.HashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(nums, target);

        if (result != null) {
            System.out.println("Indices of the two numbers that add up to the target:");
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("No solution found.");
        }
    }

    public static int[] findTwoSum(int[] nums, int target) {
        // Create a HashMap to store each number's index
        Map<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the map
            if (map.containsKey(complement)) {
                // If complement found, return the indices of both numbers
                return new int[]{map.get(complement), i};
            }
            
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution is found, return null
        return null;
    }
}
