import java.util.*;

public class Program4 {
    public static void main(String[] args) {
        Program4 p = new Program4();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array: ");
        int size = sc.nextInt();
        if(size < 2){
            System.out.println("Please enter a minimum 2 size");
            return;
        }

        int arr[] = new int[size];
        System.out.println("Enter number for array: ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Second largest element is: "+arr[arr.length-2]);

    }
}
