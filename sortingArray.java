import java.util.Arrays;
import java.util.Scanner;

public class sortingArray {

    public static void main(String []a){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of Array: ");
        n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            arr[i] = x;
        }
        // sorting array: 
        Arrays.sort(arr);

        // printing the sorted Array,
        System.out.println("Displaying the sorted Array: ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}