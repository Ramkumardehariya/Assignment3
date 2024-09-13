// package array;
import java.util.*;

public class Program9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a row size for first matrix: ");
        int row = sc.nextInt();

        System.out.println("Enter a col size for first matrix: ");
        int col = sc.nextInt();

        int arr1[][] = new int[row][col];
        System.out.println("Enter numbers for first matrices: ");
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr1[i][j] = sc.nextInt();
            }
        }
    
        int arr2[][] = new int[row][col];
        
        System.out.println("Enter number for second matrices: ");

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        int arr3[][] = new int[row][col];
        System.out.println(row+" "+col);

        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }

        System.out.println("Sum of two matrices: ");
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
