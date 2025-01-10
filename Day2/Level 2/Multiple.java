
    import java.util.Scanner;
    public class Multiple {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number ");
    int number = sc.nextInt();
    System.out.println("The result is/n ");
   for (int i = 100; i >0; i--) {
   if(i%number==0){
    System.out.println(i);
   }
   }
}
}

