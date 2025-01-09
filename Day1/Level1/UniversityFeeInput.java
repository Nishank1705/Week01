import java.util.Scanner;
public class UniversityFeeInput {
    public static void main(String[] arg) {
        Scanner input =new Scanner(System.in);
         int fee = input.nextInt();
         int discountPercent =  input.nextInt();;
         int discount = fee * 10 / 100;
         int finalFee = fee - discount;
         System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
      }
 
    
}
