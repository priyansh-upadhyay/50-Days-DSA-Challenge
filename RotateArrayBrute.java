
import java.util.*;

public class RotateArrayBrute {
    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;  

        for (int i = 0; i < k; i++) {
            int last = arr[n - 1]; 

           
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }

           
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        rotate(arr, k);

        System.out.println("Array after rotation:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}

