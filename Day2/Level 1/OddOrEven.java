
    import java.util.Scanner;
    public class OddOrEven {
    public static void main (String args[]){
        Scanner input= new Scanner(System.in);
        int number= input.nextInt();
        if(number>0){
        for(int i=1;i<=number;i++){
            if(i%2==0){
                System.out.println("Number "+ i +"is an even number");
            }
            else
            System.out.println("Number "+ i +"is an odd number");
        }
    }
    }
}

