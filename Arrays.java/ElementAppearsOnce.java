import java.util.Scanner;

public class ElementAppearsOnce {
    public static int findSingle(int[] arr) {
        int result = 0; 
        for (int num : arr) {
            result ^= num; 
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int ans = findSingle(arr);
        System.out.println("The element that appears once is: " + ans);
        
        sc.close();
    }
}
