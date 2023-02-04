/**
 * 2553. Separate the Digits in an Array
 * Difficulty : Easy
 * --------------------------
 *  Biweekly Contest 97
 *  04 February 2023
 *  6303. Separate the Digits in an Array
 */

public class Solution_2553 {
    public int[] separateDigits(int[] nums) {
        int[] res = new int[0];
        for(int num : nums) {
            String str = String.valueOf(num);
            for(int i=0; i<str.length(); i++) {
                res = Arrays.copyOf(res, res.length + 1);
                res[res.length - 1] = str.charAt(i) - '0';
            }
        }
        return res;
    }
}
