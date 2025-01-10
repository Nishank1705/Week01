
    
    import java.util.*;
    public class Harshad { 
             public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number ");
            int number= input.nextInt();
            int originalNumber=number;
            int sum=0;
                int rem;
            if(number>10){
            while(number!=0){
                rem=number%10;
                sum=sum+rem;
                number=number/10;
            }if(originalNumber%sum == 0)
            System.out.println("The number "+ originalNumber +" is a harshad number");
            else
            System.out.println("The number "+ originalNumber +" is not a harshad number");
        }
        else
        System.out.println("Enter number with atleast 2 digit");
    }
    }
    
    
