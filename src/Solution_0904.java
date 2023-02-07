/**
 * 0904. Fruit Into Baskets
 * Difficulty : Medium
 */

public class Solution_0904 {
    public int totalFruit(int[] fruits) {
        int res = 0, l = 0, n = fruits.length;
        int ans[] = new int[n];
        int dist = 0;
        for(int i=0; i<n; i++) {
            if(ans[fruits[i]] == 0) {
                dist++;
            }
            ans[fruits[i]]++;
            while(dist > 2) {
                ans[fruits[l]]--;
                if(ans[fruits[l]] == 0) {
                    dist--;
                }
                l++;
            }
            res = Math.max(res, i-l+1);
        }
        return res;
    }
}
