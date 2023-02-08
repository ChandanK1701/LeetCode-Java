/**
 * 0045. Jump Game II
 * Difficulty : Medium
 */

public class Solution_0045 {
    public int jump(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int step = 0, low = 0, high = 0, reach = 0;
        while(high < nums.length - 1) {
            step++;
            for(int i=low; i<=high; i++) {
                reach = Math.max(reach, i + nums[i]);
            }
            low = high + 1;
            high = reach;
        }
        return step;
    }
}
