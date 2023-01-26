/**
 * 0977. Squares of a Sorted Array
 * Difficulty : Easy
 */

public class Solution_0977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        for(int i=0; i<n; i++) {
            // res[i] = nums[i]*nums[i];
            res[i] = (int)Math.pow(nums[i], 2);
        }
        Arrays.sort(res);
        return res;
    }
}
