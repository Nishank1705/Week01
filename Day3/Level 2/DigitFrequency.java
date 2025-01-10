import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        int[] frequency = new int[10]; // Array to store frequency of digits 0-9

        // Count digits and their frequency
        while (number > 0) {
            int digit = (int) (number % 10);
            frequency[digit]++;
            number /= 10;
        }

        // Display frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        scanner.close();
    }
}