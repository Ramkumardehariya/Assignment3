// package string;
import java.util.Scanner;

public class Program12 {

    boolean solve(String str1, String str2){
        int temp1[] = new int[26];
        int temp2[] = new int[26];
        
        for(int i = 0; i<str1.length(); i++){
            temp1[str1.charAt(i)-'a']++;
            temp2[str2.charAt(i)-'a']++;
        }

        for(int i = 0; i<temp1.length; i++){
            if(temp1[i] != temp2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program12 p = new Program12();

        System.out.println("Enter a first string: ");
        String str1 = sc.nextLine();

        System.out.println("Enter a second string: ");
        String str2 = sc.nextLine();

        if(str1.length() == str2.length() || p.solve(str1, str2)){
            System.out.println("This strings are anagram ");
        }
        else{
            System.out.println("This string are not anagram ");
        }
    }
}
