/**
 * 0997. Find The Town Judge
 * Difficulty : Easy
 */

public class Solution_0997 {
    public int findJudge(int n, int[][] trust) {
        int[] trusted = new int[n+1];
        for(int[] arr : trust) {
            trusted[arr[1]]++;
            trusted[arr[0]]--;
        }
        for(int i=1; i<=n; i++) {
            if(trusted[i] == n -1) {
                return i;
            }
        }
        return -1;
    }
}
