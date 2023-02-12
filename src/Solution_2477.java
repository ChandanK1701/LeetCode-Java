/**
 * 2477. Minimum Fuel Cost to Report to the Capital
 * Difficulty : Medium
 */

public class Solution_2477 {
    long minTotalFuel;
    public long minimumFuelCost(int[][] roads, int seats) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] road : roads) {
            map.computeIfAbsent(road[0], nei -> new ArrayList<Integer>()).add(road[1]);
            map.computeIfAbsent(road[1], nei -> new ArrayList<Integer>()).add(road[0]);
        }
        dfs(0, -1, map, seats);
        return minTotalFuel;
    }

    public long dfs(int node, int parent, Map<Integer, List<Integer>> map, int seats) {
        int count = 1;
        if(!map.containsKey(node)) {
            return count;
        }
        for(int child : map.get(node)) {
            if(child != parent) {
                count += dfs(child, node, map, seats);
            }
        }
        if(node != 0) {
            minTotalFuel += Math.ceil((double)count/seats);
        }
        return count;
    }
}
