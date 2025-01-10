import java.util.Scanner;

public class LeapYearLogical {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();
        
        if (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
        
        scanner.close();
    }
}
