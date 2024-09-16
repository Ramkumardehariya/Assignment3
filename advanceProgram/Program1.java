import java.util.Scanner;

public class Program1 {

    void display(int arr[], int size, int position){
        int i = 0;
        int num = size-position+1;

        while (i < size) {
            if(i < position-1){
                arr[i] = num+1;
            }
            else{
                arr[i] = num;
            }
            num++;
            i++;
            if(num == size){
                num = 1;
            }
        }

        for(int j = 0; j<size; j++){
            System.out.print(arr[j]+" ");
        }
    }
    public static void main(String[] args) {
        Program1 p = new Program1();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter a position for rotate array ");
        int position = sc.nextInt();

        p.display(arr,size, position);
    }
}
