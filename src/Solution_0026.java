/**
 * 0026. Remove Duplicates from Sorted Array
 * Difficulty : Easy
 */

public class Solution_0026 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 1;

        while (right < len) {
            if (nums[right] > nums[left]) {
                left++;
                nums[left] = nums[right];
            }
            right++;
        }
        return left + 1;
    }
}
