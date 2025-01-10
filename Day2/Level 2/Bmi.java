import java.util.*;

public class Bmi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("Enter weight in kg and height in cm respectively");
        double weight = input.nextDouble();
        double heightCm = input.nextDouble();
        double heightM = heightCm/100; 
        double bmi = weight / (heightM * heightM); 
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("StatNormal");
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println(" Obese");
        }

    }
}
