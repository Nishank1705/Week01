import java.util.Scanner;
public class DayOfWeek {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);        
System.out.println("Enter month, day and year respectively");
 int m = input.nextInt();
 int d = input.nextInt(); // Day
 int y = input.nextInt(); // Year

 // Calculate y0, x, m0, and d0 using the given formulas
 int y0 = y - (14 - m) / 12;
 int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
 int m0 = m + 12 * ((14 - m) / 12) - 2;
 int d0 = (d + x + (31 * m0) / 12) % 7;

 // Print the result
 switch (d0){
    case 0 :
    System.out.println("The day of the week is: " + d0 +" Sunday") ;
    break;
    case 1:
    System.out.println("The day of the week is: " + d0 +" Monday") ;
    break;
    case 2:
    System.out.println("The day of the week is: " + d0 +" Tuesday") ;
    break;
    case 3:
    System.out.println("The day of the week is: " + d0 +" Wednesday") ;
    
     case 4:
     System.out.println("The day of the week is: " + d0 +" Thurday") ;
        break;
    case 5:
    System.out.println("The day of the week is: " + d0 +" Friday") ;

        break;
    case 6:
    System.out.println("The day of the week is: " + d0 +" Saturday") ;
        break;
 
}
}
}