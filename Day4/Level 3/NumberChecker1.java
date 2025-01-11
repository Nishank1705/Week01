import java.util.Arrays;
import java.util.Scanner;

public class NumberChecker1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int digitCounter = countDigits(number);
        int[] digit = storeDigits(number);
        boolean isDuck = isDuckNumber(digit);
        boolean isArmstrong = isArmstrongNumber(number, digit);
        int[] largestTwo = findingLargestTwo(digit);
        int[] smallestTwo = findingSmallestTwo(digit);

        System.out.println("Number is: " + number);
        System.out.println("Count of digit: " + digitCounter);
        System.out.println("Digits array: " + Arrays.toString(digit));
        System.out.println("Is Duck Number: " + isDuck);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        System.out.println("Largest digit: " + largestTwo[0]);
        System.out.println("Second largest digit: " + largestTwo[1]);
        System.out.println("Smallest digit: " + smallestTwo[0]);
        System.out.println("Second smallest digit: " + smallestTwo[1]);

        // Close the scanner
        sc.close();
    }

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String numStr = String.valueOf(num);
        int[] digit = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digit[i] = numStr.charAt(i) - '0';
        }
        return digit;
    }

    public static boolean isDuckNumber(int[] digit) {
        for (int i = 1; i < digit.length; i++) {
            if (digit[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrongNumber(int num, int[] digit) {
        int sum = 0;
        int power = digit.length;

        for (int digits : digit) {
            sum += Math.pow(digits, power);
        }
        return sum == num;
    }

    public static int[] findingLargestTwo(int[] digit) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digits : digit) {
            if (digits > largest) {
                secondLargest = largest;
                largest = digits;
            } else if (digits > secondLargest && digits < largest) {
                secondLargest = digits;
            }
        }
        return new int[]{largest, secondLargest};
    }

    public static int[] findingSmallestTwo(int[] digit) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digits : digit) {
            if (digits < smallest) {
                secondSmallest = smallest;
                smallest = digits;
            } else if (digits < secondSmallest && digits > smallest) {
                secondSmallest = digits;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
}
