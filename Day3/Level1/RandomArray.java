import java.util.Scanner;

public class RandomArray {
        public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
    double[] values = new double[10];
    double total = 0;
    int index = 0;

    System.out.println("Enter up to 10 numbers (0 or negative to stop):");
    while (index < 10) {
        double number = input.nextDouble();
        if (number <= 0) break;
        values[index++] = number;
    }

    for (int i = 0; i < index; i++) {
        total += values[i];
        System.out.print(values[i] + " ");
    }
    System.out.println("\nTotal: " + total);
}
}