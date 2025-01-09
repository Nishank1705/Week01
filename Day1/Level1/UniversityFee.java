public class UniversityFee {
   public static void main(String[] arg) {
        int fee = 125000;
        int discountPercent = 10;
        int discount = fee * 10 / 100;
        int finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
     }


   }