import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert each character to uppercase using charAt() and ASCII values
    public static String toUpperCase(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is lowercase
            if (c >= 'a' && c <= 'z') {
                // Convert to uppercase by subtracting 32
                chars[i] = (char) (c - 32);
            } else {
                chars[i] = c;
            }
        }
        return new String(chars);
    }

    // Method to compare two strings using charAt() and return a boolean result
    public static boolean compareStrings(String str1, String str2) {
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter the text:");
        String userInput = scanner.nextLine();

        // Convert text to uppercase using the built-in toUpperCase method
        String builtInUpperCaseText = userInput.toUpperCase();

        // Convert text to uppercase using the user-defined method
        String userDefinedUpperCaseText = toUpperCase(userInput);

        // Compare the two uppercase texts
        boolean areEqual = compareStrings(builtInUpperCaseText, userDefinedUpperCaseText);

        // Display the result
        System.out.println("Built-in toUpperCase result: " + builtInUpperCaseText);
        System.out.println("User-defined toUpperCase result: " + userDefinedUpperCaseText);
        System.out.println("Are the two uppercase texts equal? " + areEqual);
    }
}
