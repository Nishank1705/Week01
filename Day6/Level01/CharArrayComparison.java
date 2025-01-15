import java.util.Arrays;
import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        char[] userChars = getChars(input);
        char[] builtInChars = input.toCharArray();
        
        boolean areEqual = compareCharArrays(userChars, builtInChars);
        
        System.out.println("User-defined method result: " + Arrays.toString(userChars));
        System.out.println("Built-in method result: " + Arrays.toString(builtInChars));
        System.out.println("Are both arrays equal? " + areEqual);
    }
    
    // Method to return characters in a string without using toCharArray()
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }
    
    // Method to compare two char arrays and return boolean result
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
