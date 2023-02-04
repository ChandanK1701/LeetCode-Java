/**
 * 2554. Maximum Number of Integers to Choose From a Range I
 * Difficulty : Medium
 * --------------------------
 *  Biweekly Contest 97
 *  04 February 2023
 *  6304. Maximum Number of Integers to Choose From a Range I
 */

public class Solution_2554 {
    public int maxCount(int[] banned, int n, int maxSum) {
        Set<Integer> set = new HashSet<>();
        for(int num : banned) {
            set.add(num);
        }
        int res = 0;
        for(int i=1; i<=n; i++) {
            if(!set.contains(i) && maxSum - i >= 0) {
                res++;
                maxSum -= i;
            }
        }
        return res;
    }
}
