import java.util.*;

public class Program10 {

    int findLongestConsecutive(int arr[]){
        int n = arr.length;
        int ans = 0;

        HashSet<Integer> set = new HashSet<>();

        for(int i : arr){
            set.add(i);
        }

        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int index = i;

                while (set.contains(index+1)) {
                    count++;
                    index++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Program10 p = new Program10();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of the array: ");
        int size = sc.nextInt();

        int arr[] = new int[size];
        System.out.println("Enter number for array: ");

        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int num = p.findLongestConsecutive(arr);
        System.out.println("Longest Consecutive sequnece is: ");
        System.out.println(num);
    }
}
