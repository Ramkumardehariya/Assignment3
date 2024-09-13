// package array;
import java.util.*;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter number for array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int maxi = 0;

        for(int i =0; i<arr.length; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
        }

        int arr1[] = new int[maxi+1];

        for(int i = 0; i<maxi; i++){
            arr1[i] = 0;
        }

        for(int i = 0; i<arr.length; i++){
            arr1[arr[i]] += 1;
        }

        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != 0){
                System.out.println("Number is: "+i+" and frequency is: "+arr1[i]);
            }
        }
    }
}
