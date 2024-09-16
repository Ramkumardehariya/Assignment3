import java.util.Scanner;

public class Program7 {
    void moveZero(int arr[]){
        int s = 0;
        int e = arr.length-1;

        while(s < e){
            if(arr[s] != 0 && arr[e] == 0){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            else if(arr[s] == 0 && arr[e] == 0){
                s++;
            }
            else{
                e--;
            }
        }

    }
    void display(int arr[]){
        System.out.println("Print All numbers");

        for(int i =0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Program7 p = new Program7();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter number for array: ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        p.moveZero(arr);

        p.display(arr);

    }
}
