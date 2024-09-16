import java.util.Scanner;

public class Program5 {

    void solve(int arr[],int size, int sum){

        System.out.println("all pair is: ");
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i]+arr[j] == sum){
                    System.out.println(arr[i]+" ,"+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Program5 p = new Program5();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter number for array: ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a sum for pair: ");
        int sum = sc.nextInt();

        p.solve(arr, size, sum);
    }
}
