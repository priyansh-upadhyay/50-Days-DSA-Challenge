public class KadensAlgorithm {
    public static int maxSubArraySum(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;

        for (int num : arr) {
            currentSum += num;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0; // reset if sum becomes negative
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }
}
