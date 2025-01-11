import java.util.Scanner;

public class NumberChecker {

    // Method to check if a number is positive
    public boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberChecker numberChecker = new NumberChecker();

        int[] numbers = new int[5]; // Array to store 5 numbers

        // Taking user input for numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking each number for positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            if (numberChecker.isPositive(numbers[i])) {
                System.out.println("Number " + numbers[i] + " is positive.");
                if (numberChecker.isEven(numbers[i])) {
                    System.out.println("It is even.");
                } else {
                    System.out.println("It is odd.");
                }
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Comparing the first and last elements of the array
        int comparisonResult = numberChecker.compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        scanner.close();
    }
}
