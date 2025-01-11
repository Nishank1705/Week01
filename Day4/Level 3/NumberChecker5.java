import java.util.Scanner;

public class NumberChecker5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Find the factors of the number
        int[] factors = findFactors(number);

        // Display factors
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find and display the greatest factor
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest factor: " + greatestFactor);

        // Find and display the sum of factors
        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of factors: " + sumOfFactors);

        // Find and display the product of factors
        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of factors: " + productOfFactors);

        // Find and display the product of cubes of factors
        long productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of cubes of factors: " + productOfCubes);

        // Check and display if the number is a perfect number
        boolean isPerfect = isPerfectNumber(number, factors);
        System.out.println("Is the number a perfect number? " + isPerfect);

        // Check and display if the number is an abundant number
        boolean isAbundant = isAbundantNumber(number, factors);
        System.out.println("Is the number an abundant number? " + isAbundant);

        // Check and display if the number is a deficient number
        boolean isDeficient = isDeficientNumber(number, factors);
        System.out.println("Is the number a deficient number? " + isDeficient);

        // Check and display if the number is a strong number
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is the number a strong number? " + isStrong);

        scanner.close();
    }

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        // Count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Store the factors in an array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1]; // The last factor is the greatest
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static long findProductOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number, int[] factors) {
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number, int[] factors) {
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number, int[] factors) {
        int sum = findSumOfFactors(factors) - number; // Exclude the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to find factorial of a digit
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
