
    import java.util.Scanner;
    public class Factorial {
        public static void main (String args[]){
            Scanner input= new Scanner(System.in);
            int number = input.nextInt();
            int sum=1;
            while(number>0){
                sum=sum*number;
                number--;
            }
            System.out.println("Factorial is "+ sum);
        }
    } 

