import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        // Call method to generate the exception
        generateStringIndexOutOfBoundsException(input);
        
        // Call method to handle the exception
        handleStringIndexOutOfBoundsException(input);
    }
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        System.out.println(str.charAt(str.length() + 1));
    }
    
    // Method to handle StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            System.out.println(str.charAt(str.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
