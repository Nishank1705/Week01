
    // 1. Check Voting Eligibility for 10 Students
import java.util.Scanner;

public class voting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Voting Eligibility
        int[] ages = new int[10];
        System.out.println("Enter the ages of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = scanner.nextInt();
        }

       // Loop through each element in the ages array 
       for (int age : ages) { 
        // Check if the age is a negative number
         if (age < 0) {
             // If the age is negative, print an invalid age message 
             System.out.println("Invalid age");
             } else if (age >= 18) { 
                // If the age is 18 or greater, print that the student can vote
                 System.out.println("The student with the age " + age + " can vote."); 
                } else { 
                    // If the age is less than 18, print that the student cannot vote
                     System.out.println("The student with the age " + age + " cannot vote."); 
                    }
}
    }}