import java.util.Scanner;

public class FriendAnalyzer {

    // Method to find the youngest friend's name
    public String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    // Method to find the tallest friend's name
    public String findTallest(String[] names, int[] heights) {
        int maxHeight = heights[0];
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = { "Amar", "Akbar", "Anthony" };
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input age and height for each friend
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the age of " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.println("Enter the height of " + names[i] + " (in cm): ");
            heights[i] = scanner.nextInt();
        }

        // Create an instance of FriendAnalyzer
        FriendAnalyzer analyzer = new FriendAnalyzer();

        // Find and display the youngest friend
        String youngest = analyzer.findYoungest(names, ages);
        System.out.println("The youngest friend is: " + youngest);

        // Find and display the tallest friend
        String tallest = analyzer.findTallest(names, heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }
}
