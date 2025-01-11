/*Write a program Quadratic to find the roots of the equation ax2+ bx + c. 
Use Math functions Math.pow() and Math.sqrt()
Hint => 
Take a, b, and c as input values to find the roots of x.
The roots are computed using the following formulae
delta = b2+ 4*a*c
If delta is positive the find the two roots using formulae 
root1 of x = (-b + delta)/(2*a) 
root1 of x = (-b - delta)/(2*a)
If delta is zero then there is only one root of x  
root of x = -b/(2*a)
If delta is negative return empty array or nothing 
 */
import java.util.*;
public class RootsFinder {
    public static int deltaCalc(int a, int b, int c ){
        int term1 =(int) Math.pow(b,2);
        int delta = term1-(4*a*c);
        return delta; 
    }
    public static void rootsCalc(int delta, int a, int b,int c){
        if (delta>0) {
            int root1 = (((1-b)+delta)/(2*a));
            int root2 =   ((1-b)- delta)/(2*a);
           System.out.println("root1 = "+ root1+" \n root2 = "+ root2); 
        }
        else if (delta == 0){
            int root1=(1-b)/(2*a);
            System.out.println("One and only root is "+ root1);
        }else
        System.out.println("No roots available as delta is negative");
           
        }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // taking input
        System.out.println("Enter the values of a, b and c respectively");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int delta = deltaCalc(num1,num2,num3);
        rootsCalc(delta, num1, num2, num3);

    }
}
