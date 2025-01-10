
    import java.util.*;
    public class Counting {   
             public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter number to get totals individual numers in it");
            int number= input.nextInt();
            int count=0;
                int rem;
            while(number!=0){
                rem=number%10;
                number=number/10;
                count+=1;
            }System.out.println("Total numbers are "+ count);
        }
    }
    
    