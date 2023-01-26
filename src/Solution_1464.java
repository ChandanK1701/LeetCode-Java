/**
 * 1464. Maximum Product of Two Elements in an Array
 * Difficulty : Easy
 */

public class Solution_1464 {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return ((nums[n-1] - 1) * (nums[n-2] - 1));
    }
}
