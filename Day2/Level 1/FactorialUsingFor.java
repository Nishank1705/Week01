
    import java.util.Scanner;
    public class FactorialUsingFor {
        public static void main (String args[]){
            Scanner input= new Scanner(System.in);
            int number = input.nextInt();
            int sum=1;
            for(int i = number;i>0;i--){
                    sum=sum*i;
            }
            System.out.println("Factorial is "+ sum);
        }
}
