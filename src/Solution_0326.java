/**
 * 0326. Power of Three
 * Difficulty : Easy
 */

public class Solution_0326 {
    public boolean isPowerOfThree(int n) {
        int pow = 3;
        double res = Math.log10(n) / Math.log10(pow);
        if(res - (int)res == 0) {
            return true;
        }
        return false;
    }
}
