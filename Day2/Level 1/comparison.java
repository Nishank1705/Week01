 import java.util.Scanner;
 public class comparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total1 = 0.0;
        double number = input.nextDouble();
        double originalNumber = number;
         while (number>0) {
         total1 = total1 + number;
         number--;
         }
         System.out.println("Sum using while= "+ total1);
         System.out.print("Sum using formula= "+ originalNumber*(originalNumber+1)/2);
    }
}



