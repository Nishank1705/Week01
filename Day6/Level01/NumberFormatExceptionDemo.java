import java.util.Scanner;

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        // Call method to generate the exception
        generateNumberFormatException(input);
        
        // Call method to handle the exception
        handleNumberFormatException(input);
    }
    
    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Number: " + number);
    }
    
    // Method to handle NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
