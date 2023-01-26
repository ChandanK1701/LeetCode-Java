/**
 * 0926. Flip String to Monotone Increasing
 * Difficulty : Medium
 */

public class Solution_0926 {
    public int minFlipsMonoIncr(String s) {
        int dp[] = new int[2];
        for(int i=0; i<s.length(); ++i) {
            int temp = dp[0] + (s.charAt(i) == '1' ? 1 : 0);
            dp[1] = Math.min(dp[0], dp[1] + (s.charAt(i) == '0' ? 1 : 0));
            dp[0] = temp;
        }
        return Math.min(dp[0], dp[1]);
    }
}
