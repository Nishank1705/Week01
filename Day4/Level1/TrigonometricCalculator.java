public class TrigonometricCalculator {

    public static double[] calculateTrigonometricFunctions(double angle) {
        double angleInRadians = Math.toRadians(angle);
        double[] results = new double[3];
        results[0] = Math.sin(angleInRadians);
        results[1] = Math.cos(angleInRadians);
        results[2] = Math.tan(angleInRadians);
        return results;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = scanner.nextDouble();

        double[] trigValues = calculateTrigonometricFunctions(angle);

        System.out.println("Sine: " + trigValues[0]);
        System.out.println("Cosine: " + trigValues[1]);
        System.out.println("Tangent: " + trigValues[2]);

        scanner.close();
    }
}
