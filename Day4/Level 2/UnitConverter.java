
import java.util.*;
public class UnitConverter {

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;

        // return the value
        return miles;
    }
    //  Method to convert miles to kilometers and return the value.
    public static double convertMilesToKm(double a){ 
      double miles2km = 1.60934;
      return miles2km*a  ;
      }
    //Method to convert meters to feet and return the value. 
         public static double meters2feet(double a){
         double meters2feet = 3.28084;
         return  meters2feet*a  ;
        }
    //Method to convert feet to meters and return the value. 
        public static double feet2meter(double a){
        double feet2meters = 0.3048;
        return feet2meters * a;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input 
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();

        System.out.print("Enter the distance in Miles: ");
        double miles = sc.nextDouble();

        System.out.print("Enter the distance in meters: ");
        double m = sc.nextDouble();

        System.out.print("Enter the distance in feet: ");
        double ft = sc.nextDouble();

        // Call the method to converts the input
        double mileResult = UnitConverter.convertKmToMiles(km); 
        double kmResult = UnitConverter.convertMilesToKm(miles); 
        double feetResult = UnitConverter.meters2feet(m); 
        double meteResult = UnitConverter.feet2meter(ft); 

     
        System.out.println("Distance in miles from km input: " +mileResult);
        System.out.println("Distance in km from miles input: " + kmResult);
        System.out.println("Distance in feet from meter input: " + feetResult);
        System.out.println("Distance in meter from feet input: " + meteResult);
    }
}


