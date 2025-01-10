import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input: Heights of 11 football players
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of 11 football players:");
        for (int i = 0; i < 11; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = input.nextDouble();
            sum += heights[i];
        }

        // Calculate mean height
        double meanHeight = sum / 11;

        // Output: Mean height
        System.out.printf("The mean height of the football team is: %.2f meters\n", meanHeight);
    }
}
