import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a number for multiplication table:");
        int tableNum = input.nextInt();
        int[] multiplicationTable = new int[10];

        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = tableNum * (i + 1);
        }

        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(tableNum + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
    }
}
