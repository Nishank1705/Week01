import java.util.Scanner;

public class TextManipulation {

    // Method to convert each character to lowercase using charAt() and ASCII values
    public static String toLowerCase(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Check if the character is uppercase
            if (c >= 'A' && c <= 'Z') {
                // Convert to lowercase by adding 32
                chars[i] = (char) (c + 32);
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

    // Method to split the text into words and return the words along with their lengths in a 2D array
    public static String[][] splitText(String text) {
        String[] words = text.split("\\s+");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter the text:");
        String userInput = scanner.nextLine();

        // Convert text to lowercase using the built-in toLowerCase method
        String builtInLowerCaseText = userInput.toLowerCase();

        // Convert text to lowercase using the user-defined method
        String userDefinedLowerCaseText = toLowerCase(userInput);

        // Compare the two lowercase texts
        boolean areEqual = compareStrings(builtInLowerCaseText, userDefinedLowerCaseText);

        // Display the result
        System.out.println("Built-in toLowerCase result: " + builtInLowerCaseText);
        System.out.println("User-defined toLowerCase result: " + userDefinedLowerCaseText);
        System.out.println("Are the two lowercase texts equal? " + areEqual);

        // Split the text into words and get the lengths
        String[][] wordsWithLengths = splitText(userInput);

        // Display the words and their lengths
        System.out.println("Words and their lengths:");
        for (String[] wordWithLength : wordsWithLengths) {
            System.out.println("Word: " + wordWithLength[0] + ", Length: " + wordWithLength[1]);
        }
    }
}
