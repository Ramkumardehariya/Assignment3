// package array;
import java.util.*;

public class Program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }

        System.out.println("Sum of array is : "+sum);
        System.out.println("Average of array is : "+sum/arr.length);
    }
}
