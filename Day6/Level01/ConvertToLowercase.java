import java.util.Scanner;

public class ConvertToLowercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String builtInLowerCase = input.toLowerCase();
        String userDefinedLowerCase = convertToLowercase(input);
        
        boolean isEqual = compareStrings(builtInLowerCase, userDefinedLowerCase);
        
        System.out.println("Built-in lowercase: " + builtInLowerCase);
        System.out.println("User-defined lowercase: " + userDefinedLowerCase);
        System.out.println("Are both strings equal? " + isEqual);
    }
    
    // Method to convert string to lowercase without toLowerCase()
    public static String convertToLowercase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
    
    // Method to compare two strings using charAt() and return boolean result
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
}
