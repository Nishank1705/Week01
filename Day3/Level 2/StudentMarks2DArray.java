import java.util.Scanner;

public class StudentMarks2DArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] marks = new int[numStudents][3]; // 2D array for physics, chemistry, and maths marks
        double[] percentages = new double[numStudents];
        char[] grades = new char[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();

            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = total / 3.0;

            if (percentages[i] >= 90) {
                grades[i] = 'A';
            } else if (percentages[i] >= 75) {
                grades[i] = 'B';
            } else if (percentages[i] >= 50) {
                grades[i] = 'C';
            } else {
                grades[i] = 'D';
            }
        }

        System.out.println("\nResults:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": Percentage = " + percentages[i] + "%, Grade = " + grades[i]);
        }

        scanner.close();
    }
}