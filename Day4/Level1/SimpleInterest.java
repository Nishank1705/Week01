import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Principle ");
        int principle = scanner.nextInt();
        System.out.print("Enter Rate ");
        int rate = scanner.nextInt();
        System.out.print("Enter Time ");
        int time = scanner.nextInt();
        SimpleInt obj = new SimpleInt();
        double result=obj.Calc(principle, rate, time);
         System.out.println("The simple interest is "+result +" for principle "+ principle+ " and time "+ time);
}     
}  
     class SimpleInt{
        public double Calc (int principle,int rate, int time){
            double Si = (principle * rate* time)/100;
            return Si;
        }
    }
