import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the string
        System.out.println("Enter the string:");
        String originalString = scanner.next();

        // Firstly call the method to generate the Exception
        generateIllegalArgumentException(originalString);

        // Call the method to handle the Exception
        handleIllegalArgumentException(originalString);

        scanner.close();
    }

    // Method to generate the IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        // Using substring() with start index greater than end index
        System.out.println(str.substring(5, 2)); // This will generate an IllegalArgumentException
    }

    // Method to handle the IllegalArgumentException
    public static void handleIllegalArgumentException(String str) {
        try {
            // Using substring() with start index greater than end index
            System.out.println(str.substring(5, 2)); // This will generate an IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: Start index is greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught: " + e.getMessage());
        }
    }
}

