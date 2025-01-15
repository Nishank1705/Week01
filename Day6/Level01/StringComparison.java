import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = sc.next();
        System.out.print("Enter the second string: ");
        String str2 = sc.next();

        // Compare the two strings using charAt() method
        boolean areEqualCharAt = compareStringsCharAt(str1, str2);

        // Compare the two strings using the built-in equals() method
        boolean areEqualBuiltIn = str1.equals(str2);

        // Display the results
        System.out.println("Comparison using charAt() method: " + areEqualCharAt);
        System.out.println("Comparison using equals() method: " + areEqualBuiltIn);
    }

    // Method to compare two strings using charAt() method
    public static boolean compareStringsCharAt(String str1, String str2) {
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
