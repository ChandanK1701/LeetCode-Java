/**
 * 0268. Missing Number
 * Difficulty : Easy
 */

public class Solution_0268 {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        int n = nums.length;
        int sum = 0;
        int totalSum = (n*(n+1)/2);
        for(int i=0; i<nums.length; i++) {
            sum = sum + nums[i];
        }
        // totalSum = ;
        // if(sum == )
        return totalSum - sum;
    }
}
