import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

       
        System.out.print("Enter the unit price in INR: ");
        double unitPrice = input.nextDouble();
        
        
        System.out.print("Enter the quantity to be bought: ");
        double quantity = input.nextDouble();

      
        double totalPrice = unitPrice * quantity;

      
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice + ".");

     
        input.close();
    }
