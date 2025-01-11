import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        
        System.out.println("Enter the third number:");
        int number3 = scanner.nextInt();
        
        int[] result = findSmallestAndLargest(number1, number2, number3);
        
        System.out.println("The smallest number is: " + result[0]);
        System.out.println("The largest number is: " + result[1]);
        
        scanner.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int[] result = new int[2];
        
        // Finding the smallest number
        if (number1 <= number2 && number1 <= number3) {
            result[0] = number1;
        } else if (number2 <= number1 && number2 <= number3) {
            result[0] = number2;
        } else {
            result[0] = number3;
        }
        
        // Finding the largest number
        if (number1 >= number2 && number1 >= number3) {
            result[1] = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            result[1] = number2;
        } else {
            result[1] = number3;
        }
        
        return result;
    }
}

