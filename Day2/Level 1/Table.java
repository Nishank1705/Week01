
import java.util.Scanner;
public class Table {
public static void main (String args[]){
    Scanner input= new Scanner(System.in);
    System.out.println("Enter no b/w 6 and 9");
    int number=input.nextInt();
    System.out.println("Table of "+ number );
    if(number<9 && number>6){
    for(int i=1;i<=10;i++){
     
     System.out.println(number+ " * "+ i + " = " + i*number);
}
}else System.out.println("Enter number Between 6 and 9 only");
}
}


