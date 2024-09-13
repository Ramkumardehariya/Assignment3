// package array;
import java.util.*;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        
        System.out.println("Enter number for array: ");
        for(int i = 0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        int neg = 0;
        int pos = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] >= 0){
                pos++;
            }
            else{
                neg++;
            }
        }

        System.out.println(pos+" "+neg);
        int arr1[] = new int[pos+1];
        int arr2[] = new int[neg+1];

        int index1 = 0;
        int index2 = 0;
        int index = 0;
        while(index < arr.length){
            if(arr[index] >= 0){
                arr1[index1++] = arr[index++];
            }
            else{
                arr2[index2++] = arr[index++];
            }
        }

        System.out.println("All positive integer is: ");
        for(int i = 0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("All negative integer is: ");
        for(int i =0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    
    }
}
