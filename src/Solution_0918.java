/**
 * 0918. Maximum Sum Circular Subarray
 * Difficulty : Medium
 */

public class Solution_0918 {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;
        for(int i : nums) {
            totalSum += i;
            currMaxSum = Math.max(currMaxSum + i, i);
            currMinSum = Math.min(currMinSum + i, i);
            maxSum = Math.max(maxSum, currMaxSum);
            minSum = Math.min(minSum, currMinSum);
        }
        if(maxSum < 0) {
            return maxSum;
        }
        return Math.max(maxSum, totalSum - minSum);
    }
}
