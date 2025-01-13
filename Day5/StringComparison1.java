import java.util.*;
public class StringComparison1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Text 1");
        String string1 = input.nextLine();
        System.out.println("Enter Text 2");
        String string2 = input.nextLine();
        boolean flag = Conversion(string1, string2);
        if(flag == true || string1.compareTo(string2)==0)
        System.out.println("same strings");
        else if(flag==true || string1.compareTo(string2)==-1 )
        System.out.println("Same string when compared with chatAt method but different with inbuilt functions");
        else
        System.out.println("Different Strings");
    }
    public static boolean Conversion(String input1, String input2){
        boolean flag = false;
        for(int i =0; i< input1.length();i++){
            if(input1.length()==input2.length()){
                if (input1.charAt(i) != input2.charAt(i)){
                    flag = false;
                    break;
                }else
                     flag=true;
            }
            else 
                return flag = false;
        }
    return flag;
    }
}
