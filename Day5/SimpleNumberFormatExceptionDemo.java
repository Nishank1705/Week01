import java.util.Scanner;

public class SimpleNumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException() {
        String userInput = "abc"; // Non-numeric string
        int number = Integer.parseInt(userInput); // This will throw NumberFormatException
    }

    // Method to handle NumberFormatException
    public static void handleException() {
        try {
            generateException();
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Call method to generate and handle exception
        handleException();
    }
}
