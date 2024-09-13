// package array;
import java.util.*;


public class Program1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array: ");
        int size = sc.nextInt();
        
        int arr[] = new int[size];

        System.out.println("Enter number for array: ");

        for(int i= 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
