
    import java.util.Scanner;
    public class ComparisonUsingFor {
       public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           double total1 = 0.0;
           int number = input.nextInt();
           double originalNumber = number;
            for(int i = number;i>=0;i-- ){
            total1 = total1 + i;
            }
            System.out.println("Sum using while= "+ total1);
            System.out.print("Sum using formula= "+ originalNumber*(originalNumber+1)/2);
       }
   }
