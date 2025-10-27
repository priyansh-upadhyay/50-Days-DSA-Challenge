import java.util.HashSet;
import java.util.Scanner;

public class SubarrayWithZeroSum {

    public static boolean hasZeroSumSubarray(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;

            if (currentSum == 0 || set.contains(currentSum) || num == 0) {
                return true;
            }

            set.add(currentSum);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (hasZeroSumSubarray(arr)) {
            System.out.println("Yes, there exists a subarray with sum 0.");
        } else {
            System.out.println("No subarray with sum 0 found.");
        }
    }
}
