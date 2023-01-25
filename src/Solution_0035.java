/**
 * 0035. Search Insert Position
 * Difficulty : Easy
 */
public class Solution_0035 {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
