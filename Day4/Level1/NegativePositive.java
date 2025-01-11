
    import java.util.Scanner;
    public class NegativePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number ");
        int num = scanner.nextInt();
        System.out.println("the number "+ num + " is "+ Decider(num) );
       
    }
    public static int Decider(int a){
        if (a>0) {
            return 1;
        }
        else if (a==0){
            return 0;
        }
        else{
        return -1;
        }
    }
    }

