/**
 * 1979. Find Greatest Common Divisor of Array
 * Difficulty : Easy
 */

public class Solution_1979 {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        int res = gcd(min, max);
        return res;
    }

//    Function to find GCD
    static int gcd(int a, int b) {
        if(a == 0) {
            return b;
        }
        return gcd(b%a, a);
    }
}
