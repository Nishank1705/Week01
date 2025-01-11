import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
     
        LeapYear.Check(year);
    }
        public static void Check(int year){
        if (year < 1582) {
            System.out.println("The LeapYear program only works for year >= 1582.");
          
        } else {
            if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
             
            } else {
                System.out.println(year + " is not a Leap Year.");
              
            }
        }

    }
}
