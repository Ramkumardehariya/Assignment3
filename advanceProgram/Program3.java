import java.util.*;

public class Program3 {

    void interSectionArray(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if(arr1[i] > arr2[j]){
                j++;
            }
            else if(arr1[i] < arr2[j]){
                i++;
            }
            else{
                System.out.println(arr1[i]+" ");
                i++;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Program3 p = new Program3();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size for first array: ");
        int size1 = sc.nextInt();

        System.out.println("Enter a array for first array: ");
        int arr1[] = new int[size1];

        for(int i = 0; i<size1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter a size for second array: ");
        int size2 = sc.nextInt();

        System.out.println("Enter a array for second array: ");
        int arr2[] = new int[size2];

        for(int i = 0; i<size2; i++){
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        p.interSectionArray(arr1, arr2);

    }
}
