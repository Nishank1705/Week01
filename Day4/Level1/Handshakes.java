import java.util.Scanner;
public class Handshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Number os students ");
        int students = scanner.nextInt();
        NoHandshakes object = new NoHandshakes();
        double  result =object.CalculationForHandshake(students);
        System.out.println("Total number of handshakes are "+ result );
  
    }}
     class NoHandshakes{
        public int CalculationForHandshake(int n){
             int result = n*(n-1)/2;
            return result;
        }
    }
