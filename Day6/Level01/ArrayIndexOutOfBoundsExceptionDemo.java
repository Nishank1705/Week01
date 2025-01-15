import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.print("Enter an index: ");
        int index = scanner.nextInt();
        
        // Call method to generate the exception
        generateArrayIndexOutOfBoundsException(names, index);
        
        // Call method to handle the exception
        handleArrayIndexOutOfBoundsException(names, index);
    }
    
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateArrayIndexOutOfBoundsException(String[] array, int index) {
        System.out.println(array[index]);
    }
    
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleArrayIndexOutOfBoundsException(String[] array, int index) {
        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
}
