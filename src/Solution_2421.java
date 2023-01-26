/**
 * 2421. Number of Good Paths
 * Difficulty : Hard
 */

public class Solution_2421 {
    public int numberOfGoodPaths(int[] vals, int[][] edges) {
        int n = vals.length;
        int[] parent = new int[n];
        int[] maxElement = new int[n];
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            maxElement[i] = vals[i];
            count[i] = 1;
        }
        Arrays.sort(edges, Comparator.comparingInt(a -> Math.max(vals[a[0]], vals[a[1]])));
        int ans = n;
        for (int[] it : edges) {
            int a = findParent(parent, it[0]);
            int b = findParent(parent, it[1]);
            if (maxElement[a] != maxElement[b]) {
                if (maxElement[a] > maxElement[b]) {
                    parent[b] = a;
                } else {
                    parent[a] = b;
                }
            } else {
                parent[b] = a;
                ans += count[a] * count[b];
                count[a] += count[b];
            }
        }
        return ans;
    }

    private int findParent(int[] parent, int a) {
        if (a == parent[a]) {
            return a;
        }
        parent[a] = findParent(parent, parent[a]);
        return parent[a];
    }
}
