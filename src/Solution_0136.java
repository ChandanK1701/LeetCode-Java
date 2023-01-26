/**
 * 0136. Single Number
 * Difficulty : Easy
 */

public class Solution_0136 {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i : nums) {
            res = res ^ i;
        }
        return res;
    }
}
