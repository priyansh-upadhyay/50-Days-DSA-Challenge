import java.util.HashMap;

public class LongestSubarraySumKWithNegative {

    public static int longestSubarrayWithSumK(int[] arr, int K) {
        HashMap<Integer, Integer> prefixMap = new HashMap<>();
        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == K) {
                maxLen = i + 1;
            }

            if (prefixMap.containsKey(prefixSum - K)) {
                int len = i - prefixMap.get(prefixSum - K);
                maxLen = Math.max(maxLen, len);
            }

            if (!prefixMap.containsKey(prefixSum)) {
                prefixMap.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int K = 3;
        System.out.println("Length of longest subarray with sum K: " + longestSubarrayWithSumK(arr, K));
    }
}

