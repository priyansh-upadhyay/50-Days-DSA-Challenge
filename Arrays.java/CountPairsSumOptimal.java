 import java.util.*;

public class CountPairsSumOptimal {
    public static int countPairs(int[] arr, int K) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = K - num;
            if (map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 1};
        int K = 6;

        System.out.println("Total pairs with sum " + K + " = " + countPairs(arr, K));
    }
}
