import java.util.*;

public class Program9 {

    void findSubArray(int arr[], int target){
        System.out.println("All subarray is: ");

        for(int i = 0; i<arr.length; i++){
            int sum = 0;
            for(int j = i; j<arr.length; j++){
                sum += arr[j];
                if(sum == target){
                    for(int k = i; k<=j; k++){
                        System.out.print(arr[k]+" ");
                    }
                    System.out.println();
                    break;
                }
                else if(sum > target){
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        Program9 p = new Program9();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter number for array: ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter a sum for find subarray: ");
        int sum = sc.nextInt();

        p.findSubArray(arr, sum);
    }
}
