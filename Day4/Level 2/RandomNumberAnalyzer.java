import java.util.Arrays;

public class RandomNumberAnalyzer {

    // Method to generate an array of 4-digit random numbers
    public int[] generate4DigitRandomArray(int size) {
        int[] randomNumbers = new int[size];
        for (int i = 0; i < size; i++) {
            randomNumbers[i] = 1000 + (int) (Math.random() * 9000); // Ensures a 4-digit number
        }
        return randomNumbers;
    }

    // Method to calculate the average, minimum, and maximum of an array
    public double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = sum / numbers.length;
        return new double[] { average, min, max };
    }

    // Main method
    public static void main(String[] args) {
        RandomNumberAnalyzer analyzer = new RandomNumberAnalyzer();

        // Generate 5 random 4-digit numbers
        int[] randomNumbers = analyzer.generate4DigitRandomArray(5);
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));//to get array output in sout

        // Find average, min, and max
        double[] results = analyzer.findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}
