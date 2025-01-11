import java.util.Scanner;
public class RunningAthlete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Side 1 ");
        int side1 = scanner.nextInt();
        System.out.print("Enter Side 2 ");
        int side2 = scanner.nextInt();
        System.out.print("Enter Side 3");
        int side3 = scanner.nextInt();
        double perimeter = side1 + side2 + side3;
        System.out.println("Number of rounds required "+ NoOfRounds(perimeter));
    }
    public static double NoOfRounds(double a){
        double result = 5000/a;
        return result;
    }
}