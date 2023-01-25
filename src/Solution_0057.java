/**
 * 0057. Insert Interval
 * Difficulty : Medium
 */

public class Solution_0057 {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        final int n = intervals.length;
        ArrayList<int []> ans = new ArrayList<>();
        int i = 0;

        while(i < n && intervals[i][1] < newInterval[0]) {
            ans.add(intervals[i++]);
        }
        while(i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            ++i;
        }
        ans.add(newInterval);
        while(i < n) {
            ans.add(intervals[i++]);
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
