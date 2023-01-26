/**
 * 1519. Number of Nodes in the Sub-Tree With the Same Label
 * Difficulty : Medium
 */

public class Solution_1519 {

    int ans[];
    public int[] countSubTrees(int n, int[][] edges, String labels) {
        ans = new int[n];
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0; i<n; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for(int[] x: edges) {
            adj.get(x[0]).add(x[1]);
            adj.get(x[1]).add(x[0]);
        }
        dfs(-1, 0, adj, labels);
        return ans;
    }

    private int[] dfs(int parent, int child, List<List<Integer>> adj, String labels) {
        int count[] = new int[26];
        for(int x : adj.get(child)) {
            if(parent != x) {
                int res[] = dfs(child, x, adj, labels);
                for(int i=0; i<res.length; i++) {
                    count[i] += res[i];
                }
            }
        }
        char ch = labels.charAt(child);
        count[ch-'a']++;
        ans[child] = count[ch-'a'];
        return count;
    }
}
