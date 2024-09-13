// package string;
import java.util.*;

public class Program11 {

    boolean solve(String str){
        int s = 0;
        int e = str.length()-1;

        while(s < e){
            if(str.charAt(s) != str.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program11 p = new Program11();

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        if(p.solve(str)){
            System.out.println("This  is a palindrome ");
        }
        else{
            System.out.println("This string is not palindrome");
        }
    }
}
