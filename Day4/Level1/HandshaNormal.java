
    import java.util.Scanner;
    public class HandshaNormal {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    int numberOfStudents = input.nextInt();
    int totalHandShakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
    System.out.println("Total possible handshakes: " + totalHandShakes);
        input.close();
    }   
}


