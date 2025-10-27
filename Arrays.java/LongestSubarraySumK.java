public class LongestSubarraySumK {

    public static int longestSubarrayWithSumK(int[] arr, int K) {
        int start = 0, end = 0;
        int sum = 0;
        int maxLen = 0;

        while (end < arr.length) {
            sum += arr[end];
            while (sum > K) {
                sum -= arr[start];
                start++;
            }
            if (sum == K) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
            end++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 2, 3};
        int K = 6;
        System.out.println("Length of longest subarray with sum K: " + longestSubarrayWithSumK(arr, K));
    }
}
