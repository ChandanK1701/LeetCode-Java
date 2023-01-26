/**
 * 0134. Gas Station
 * Difficulty : Medium
 */

public class Solution_0134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0, tank = 0, index = 0;
        for(int i=0; i<cost.length; i++) {
            int consume = gas[i] - cost[i];
            tank = tank + consume;
            if(tank < 0) {
                index = i + 1;
                tank = 0;
            }
            total = total + consume;
        }
        return total < 0 ? -1 : index;
    }
}
