/**
 * 1626. Best Team With No Conflicts
 * Difficulty : Medium
 */

public class Solution_1626 {
    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int players[][] = new int[n][2];
        int dp[] = new int[n];
        for(int i=0; i<n; i++) {
            players[i][0] = ages[i];
            players[i][1] = scores[i];
        }
        Arrays.sort(players, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        dp[0] = players[0][1];
        for(int i=1; i<n; i++) {
            int maxScore = players[i][1];
            for(int j=0; j<i; j++) {
                if(players[i][1] >= players[j][1]) {
                    maxScore = Math.max(maxScore, dp[j] + players[i][1]);
                }
            }
            dp[i] = maxScore;
        }
        int bestScore = 0;
        for(int score : dp) {
            bestScore = Math.max(bestScore, score);
        }
        return bestScore;
    }
}
