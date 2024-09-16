

import java.util.Scanner;

public class Program2 {

    int[] merge(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        int arr[] = new int[m+n];
        int i = 0, j = 0;
        int k = 0;

        while (i < n && j < m) {
            if(arr1[i] < arr2[j]){
                arr[k++] = arr1[i++];
            }
            else{
                arr[k++] = arr2[j++];
            }
        }

        while (i < n) {
            arr[k++] = arr1[i++];
        }
        while (j < m) {
            arr[k++] = arr2[j++];
        }

        return arr;
    }

    boolean checkArray(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }

    void display(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        Program2 p = new Program2();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for first array: ");
        int size1 = sc.nextInt();

        System.out.println("Enter a array for first sorted array: ");
        int arr1[] = new int[size1];

        for(int i = 0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }
        if(p.checkArray(arr1) == false){
            System.out.println("This is not a sorted array");
            return;
        }


        System.out.println("Enter a size for second array: ");
        int size2 = sc.nextInt();

        System.out.println("Enter a array for second sorted array: ");
        int arr2[] = new int[size2];

        for(int i = 0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }

        if(p.checkArray(arr2) == false){
            System.out.println("This is not a sorted array");
            return;
        }

        int arr[] = p.merge(arr1, arr2);

        p.display(arr);
    }
}
