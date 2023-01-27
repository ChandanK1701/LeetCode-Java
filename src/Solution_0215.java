/**
 * 0215. Kth Largest Element in an Array
 * Difficulty : Medium
 */

public class Solution_0215 {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return (nums[nums.length-k]);
    }
}
