/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;

public class SubstringComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string and start/end indexes
        System.out.println("Enter the string:");
        String originalString = scanner.next();
        System.out.println("Enter the start index:");
        int startIndex = scanner.nextInt();
        System.out.println("Enter the end index:");
        int endIndex = scanner.nextInt();

        // Create a substring using charAt() method
        String charAtSubstring = createSubstringUsingCharAt(originalString, startIndex, endIndex);

        // Create a substring using the built-in substring() method
        String builtInSubstring = originalString.substring(startIndex, endIndex);

        // Compare the two substrings
        boolean areEqual = compareSubstrings(charAtSubstring, builtInSubstring);

        // Display the results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are both substrings equal? " + areEqual);

        scanner.close();
    }

    // Method to create a substring from a string using charAt() method
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    // Method to compare two substrings using charAt() method
    public static boolean compareSubstrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
