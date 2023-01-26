/**
 * 1443. Minimum Time to Collect All Apples in a Tree
 * Difficulty : Medium
 */

public class Solution_1443 {
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adj.add(new ArrayList());
        }
        for(int[] k : edges) {
            adj.get(k[0]).add(k[1]);
            adj.get(k[1]).add(k[0]);
        }
        return min(0, adj, hasApple, 0);
    }

    public int min(int index, List<List<Integer>> adj, List<Boolean> hasApple, int parent) {
        int total = 0;
        for(int k : adj.get(index)) {
            if(k == parent) {
                continue;
            }
            total += min(k, adj, hasApple, index);
        }
        if(index != 0 && (hasApple.get(index) || total > 0)) {
            total += 2;
        }
        return total;
    }
}
