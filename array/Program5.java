// package array;
import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter number for array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        
        System.out.println("Even number is: ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

        System.out.println("Odd number is: ");
        for(int i = 0; i<arr.length; i++){
            if(arr[i]%2 != 0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
