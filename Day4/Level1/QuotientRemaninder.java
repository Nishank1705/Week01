
    import java.util.Scanner;

    public class QuotientRemaninder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int number1 = scanner.nextInt();
        
        System.out.println("Enter the second number:");
        int number2 = scanner.nextInt();
        int [] reult=findRemainderAndQuotient(number1,number2);
        System.out.println("Quotient is: " +  reult[0]);
        System.out.println("Remainder is: " + reult[1]);

} public static int[] findRemainderAndQuotient(int number, int divisor) {
    int[] result = new int[2];
    result [0] = number/divisor;
    result [1]  = number%divisor;
    return result;

    }
}
