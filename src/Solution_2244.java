/**
 * 2244. Minimum Rounds to Complete All Tasks
 * Difficulty : Medium
 */

public class Solution_2244 {
    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int task: tasks) {
            map.put(task, map.getOrDefault(task, 0)+1);
        }
        int ans = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int freq = entry.getValue();
            if(freq == 1) {
                return -1;
            }
            if(freq % 3 != 0) {
                ans = ans + freq/3+1;
            }
            else {
                ans = ans + freq/3;
            }
        }
        return ans;
    }
}
