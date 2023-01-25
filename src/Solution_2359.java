/**
 * 2359. Find Closest Node to Given Two Nodes
 * Difficulty : Medium
 */

public class Solution_2359 {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<edges.length; i++) {
            List<Integer> list = map.getOrDefault(i, new ArrayList<>());
            list.add(edges[i]);
            map.put(i, list);
        }

        int dist1[] = new int[edges.length];
        int dist2[] = new int[edges.length];
        int dist[] = new int[edges.length];

        Arrays.fill(dist1, -1);
        Arrays.fill(dist2, -1);
        Arrays.fill(dist, Integer.MAX_VALUE);

        boolean visited[] = new boolean[edges.length];
        Arrays.fill(visited, false);
        dfs(map, dist1, node1, 0, visited);

        Arrays.fill(visited, false);
        dfs(map, dist2, node2, 0, visited);

        for(int i=0; i<edges.length; i++) {
            if(dist1[i] != -1 && dist2[i] != -1) {
                dist[i] = Math.max(dist1[i], dist2[i]);
            }
        }

        int ans = -1;
        int ref = Integer.MAX_VALUE;
        for(int i=0; i<edges.length; i++) {
            if(ref > dist[i]) {
                ref = dist[i];
                ans = i;
            }
        }
        return ans;
    }

    public void dfs(Map<Integer, List<Integer>> map, int[] dis, int cur, int cost, boolean[] visited) {
        if(visited[cur]) {
            return;
        }
        visited[cur] = true;
        dis[cur] = cost;
        for(int child : map.get(cur)) {
            if(child != -1 && !visited[child]) {
                dfs(map, dis, child, cost+1, visited);
            }
        }
    }
}
