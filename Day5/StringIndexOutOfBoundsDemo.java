import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the string:");
        String originalString = scanner.next();

        // Firstly call the method to generate the Exception
        generateStringIndexOutOfBoundsException(originalString);

        // Call the method to handle the Exception
        handleStringIndexOutOfBoundsException(originalString);

        scanner.close();
    }

    // Method to generate the StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Accessing index beyond the length of the string
        System.out.println(str.charAt(str.length())); // This will generate a StringIndexOutOfBoundsException
    }

    // Method to handle the StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            // Accessing index beyond the length of the string
            System.out.println(str.charAt(str.length())); // This will generate a StringIndexOutOfBoundsException
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught: Accessed index is out of bounds.");
        }
    }
}
