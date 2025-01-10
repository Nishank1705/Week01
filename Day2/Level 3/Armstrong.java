import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number= input.nextInt();
        int originalNumber=number;
        int sum=0;
        int cube;
            int rem;
        while(number!=0){
            rem=number%10;
            number=number/10;
            cube=rem*rem*rem;
            sum=sum+cube;
        }
        if(originalNumber == sum){
            System.out.println("Number is Armstrong");
        }else 
        System.out.println("Number is not Armstrong");
        }
    }

