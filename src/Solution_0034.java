/**
 * 0034. Find First and Last Position of Element in Sorted Array
 * Difficulty : Medium
 */
public class Solution_0034 {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        int len = nums.length;

        for(int i=0; i<len; i++) {
            if(nums[i] == target) {
                res[0] = i;
                break;
            }
        }

        for(int i=len-1; i>=0; i--) {
            if(nums[i] == target) {
                res[1] = i;
                break;
            }
        }

        return res;
    }
}
