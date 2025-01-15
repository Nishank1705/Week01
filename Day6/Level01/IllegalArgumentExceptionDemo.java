import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        // Call method to generate the exception
        generateIllegalArgumentException(input);
        
        // Call method to handle the exception
        handleIllegalArgumentException(input);
    }
    
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        System.out.println(str.substring(5, 2));
    }
    
    // Method to handle IllegalArgumentException
    public static void handleIllegalArgumentException(String str) {
        try {
            System.out.println(str.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}
