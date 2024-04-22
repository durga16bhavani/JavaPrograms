package Day123assignments;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.printf("Enter string1:");
        String str1 =sc.next();
        System.out.printf("Enter string2:");
        String str2 =sc.next();
        System.out.printf("Enter substring length:");
        int substringLength =sc.nextInt();
        String result = extractMiddleSubstring(str1, str2, substringLength);
        System.out.println("Middle Substring: " + result);
    }

    public static String extractMiddleSubstring(String str1, String str2, int substringLength) {
        // Concatenate the two strings
        String concateString = str1.concat(str2);
        System.out.println("The concatenated String of string1 and string2 is:"+ concateString);

        // Reverse the concatenated string
        StringBuilder reversed = new StringBuilder(concateString);
        reversed.reverse();
        String reversedString = reversed.toString();
        System.out.println("The reversed string of concatenated string is:"+reversedString);

        // Calculate the middle index of the resulting string
        int middleIndex = reversedString.length() / 2;

        // Calculate the start index for the substring
        int startIndex = middleIndex - substringLength / 2;

        // Handle edge cases
        if (startIndex < 0) {
            startIndex = 0;
        }
        if (substringLength > reversedString.length()) {
            substringLength = reversedString.length();
        }

        // Extract the middle substring
        return reversedString.substring(startIndex, startIndex + substringLength);
    }
}
