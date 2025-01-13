import java.util.Scanner;

public class CharacterArrayComparison {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the string:");
        String originalString = scanner.next();

        // Get character array using user-defined method
        char[] customCharArray = getCharsUsingCustomMethod(originalString);

        // Get character array using the built-in toCharArray() method
        char[] builtInCharArray = originalString.toCharArray();

        // Compare the two character arrays
        boolean areEqual = compareCharArrays(customCharArray, builtInCharArray);

        // Display the results
        System.out.println("Character array using custom method: " + new String(customCharArray));
        System.out.println("Character array using toCharArray(): " + new String(builtInCharArray));
        System.out.println("Are both character arrays equal? " + areEqual);

        scanner.close();
    }

    // Method to return all characters in a string without using toCharArray()
    public static char[] getCharsUsingCustomMethod(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
