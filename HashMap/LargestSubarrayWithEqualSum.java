

import java.util.HashMap;

public class LargestSubarrayWithEqualSum {
    public int twoSum(int[] nums, int targetSum) {
        int sum = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);  // Important: prefix sum 0 at index -1
        // prefix sum , index
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - targetSum)) {
                maxLen = Math.max(maxLen, i - map.get(sum - targetSum));
            }

            // Only store first occurrence of this sum
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        LargestSubarrayWithEqualSum obj = new LargestSubarrayWithEqualSum();
        int[] nums = {1, -1, 1, -1 ,2, 3, 7, 5};
        int target = 0;

        int result = obj.twoSum(nums, target);
        System.out.println("Length of the largest subarray with sum " + target + " is: " + result);
    }
}









