import java.util.Scanner;
    public class HeightConverter {
        
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            double height= input.nextDouble();
            double heightInFoot=height/(12*2.54);
            double heightInInch=height/2.54;
        System.out.println("Your Height in cm is "+ height + " while in feet is " + heightInFoot+ " and inches is"+ heightInInch);
       
        
    
    }
    }
    
