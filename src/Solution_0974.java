/**
 * 0974. Subarray Sums Divisible by K
 * Difficulty : Medium
 */

public class Solution_0974 {
    public int subarraysDivByK(int[] nums, int k) {
        int res[] = new int[k];
        res[0] = 1;
        int count = 0, sum = 0;
        for(int i : nums) {
            sum = (sum + i) % k;
            if(sum < 0) {
                sum = sum + k;
            }
            count = count + res[sum];
            res[sum]++;
        }
        return count;
    }
}
