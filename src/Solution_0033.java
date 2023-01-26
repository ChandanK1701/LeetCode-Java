/**
 * 0033. Search in Rotated Sorted Array
 * Difficulty : Medium
 */

public class Solution_0033 {
    public int search(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
