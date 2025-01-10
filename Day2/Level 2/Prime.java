import java.util.Scanner;
public class Prime{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        boolean flag = true;
        for(int i = 2; i <= number / 2; i++){
            if(number % i == 0){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Number is a prime number");
        }
        else{
            System.out.println("Number is not a prime number");
        }
    }
}
