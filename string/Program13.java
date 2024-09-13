// package string;

import java.util.Scanner;

public class Program13 {

    void solve(String str){
        int arr[] = new int[26];

        for(int i = 0; i<str.length(); i++){
            arr[str.charAt(i)-'a']++;
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i] != 0){
                System.out.println((char)(i+'a')+" "+arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Program13 p = new Program13();

        System.out.println("Enter a first string: ");
        String str = sc.nextLine();

        String temp = str.toLowerCase();

        p.solve(temp);
    }
}
