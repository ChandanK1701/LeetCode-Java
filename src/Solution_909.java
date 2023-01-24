/**
 * 909. Snakes and Ladders
 * Difficulty : Medium
 */

public class Solution_909 {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int ans = 0;
        Queue<Integer> q = new ArrayDeque<>(Arrays.asList(1));
        boolean[] seen = new boolean[1+n*n];
        int[] arr = new int[1+n*n];
        for(int i=0; i<n; ++i) {
            for(int j=0; j<n; ++j) {
                arr[(n-1-i) * n+((n-i & 1) == 1 ? j+1 : n-j)] = board[i][j];
            }
        }
        while(!q.isEmpty()) {
            ++ans;
            for(int size=q.size(); size>0; --size) {
                int curr = q.poll();
                for(int next=curr+1; next<=Math.min(curr+6, n*n); ++next) {
                    int dest = arr[next] > 0 ? arr[next] : next;
                    if(dest == n*n) {
                        return ans;
                    }
                    if(seen[dest]) {
                        continue;
                    }
                    q.offer(dest);
                    seen[dest] = true;
                }
            }
        }
        return -1;
    }
}