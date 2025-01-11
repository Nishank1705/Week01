import java.util.Scanner;

public class FootballTeamStats {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Scanner scanner = new Scanner(System.in);

        // Take input for heights
        System.out.println("Enter the heights of 11 players in the football team (in cms):");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height for player " + (i + 1) + ": ");
            heights[i] = scanner.nextInt();
            // Validate the input height range
            while (heights[i] < 150 || heights[i] > 250) {
                System.out.print("Height must be between 150 and 250 cms. Please re-enter: ");
                heights[i] = scanner.nextInt();
            }
        }

        // Calculate statistics
        int sum = findSum(heights);
        double mean = findMean(heights, sum);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        // Display results
        System.out.println("\nHeights of players in the football team:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        System.out.println("Sum of all heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");

        scanner.close();
    }

    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    // Method to find the mean height
    public static double findMean(int[] arr, int sum) {
        return (double) sum / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
