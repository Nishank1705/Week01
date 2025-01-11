import java.util.Scanner;

public class ChocolateDivision {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int[] result = new int[2];
        result[0] = number / divisor; // Quotient: chocolates each child gets
        result[1] = number % divisor; // Remainder: remaining chocolates
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of chocolates from the user
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();

        // Get the number of children from the user
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();

        // Calculate quotient and remainder
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Print the results
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);
        
        scanner.close();
    }
}
