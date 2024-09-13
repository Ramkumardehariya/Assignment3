import java.util.Scanner;

public class Program10 {
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
    
        System.out.println("Enter a row for second matrices: ");
        int row2 = sc.nextInt();

        System.out.println("Enter a row for second matrices: ");
        int col2 = sc.nextInt();

        if(row != col2 || col != row2){
            System.out.println("Its not possible for multiply matirces: ");
            return;
        }

        int arr2[][] = new int[row2][col2];
        System.out.println("Enter numbers for second matrices: ");
        
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i<row; i++){
            int sum = 0;
            for(int j = 0; j<col; j++){
                sum += arr1[i][j]*arr2[j][i];
            }
            System.out.println(sum);
        }
    }
}
