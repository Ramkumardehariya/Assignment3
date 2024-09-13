// package array;
import java.util.*;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  a size for array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int maxi = arr[0];
        int mini = arr[0];

        for(int i = 0; i<arr.length; i++){
            if(maxi < arr[i]){
                maxi = arr[i];
            }
            if(mini > arr[i]){
                mini = arr[i];
            }
        }

        System.out.println("The maxi is: "+maxi);
        System.out.println("The mini is: "+mini);
    }
}
