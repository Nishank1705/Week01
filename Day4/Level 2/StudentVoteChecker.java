import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Negative age is invalid
        }
        return age >= 18;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentVoteChecker voteChecker = new StudentVoteChecker();

        int[] studentAges = new int[10]; // Array to store ages of 10 students

        // Taking user input for student ages
        for (int i = 0; i < studentAges.length; i++) {
            System.out.println("Enter the age of student " + (i + 1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Checking if students can vote
        for (int i = 0; i < studentAges.length; i++) {
            boolean canVote = voteChecker.canStudentVote(studentAges[i]);
            System.out.println("Student " + (i + 1) + " (Age: " + studentAges[i] + ") " +
                    (canVote ? "can vote." : "cannot vote."));
        }

        scanner.close();
    }
}
