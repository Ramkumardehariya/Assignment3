// package array;
import java.util.*;

public class Program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");

        int size = sc.nextInt();

        System.out.println("Enter number for aray: ");
        int arr[] = new int[size];

        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int s = 0;
        int e = arr.length-1;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
