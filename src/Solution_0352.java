/**
 * 0352. Data Stream as Disjoint Intervals
 * Difficulty : Hard
 */

public class Solution_0352 {

    class SummaryRanges {
        Map<Integer, Integer> map;

        public SummaryRanges() {
            map = new TreeMap<>();
        }

        public void addNum(int value) {
            if (map.containsKey(value)) {
                return;
            }
            map.put(value, value);
            int left = value;
            int right = value;
            if (map.containsKey(value - 1)) {
                left = map.get(value - 1);
            }
            if (map.containsKey(value + 1)) {
                right = map.get(value + 1);
            }
            map.put(right, left);
            map.put(left, right);
        }

        public int[][] getIntervals() {
            List<int[]> intervals = new ArrayList<>();
            int min = -1;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() > min) {
                    intervals.add(new int[]{entry.getKey(), entry.getValue()});
                    min = entry.getValue();
                }
            }
            int length = intervals.size();
            int[][] res = new int[length][2];
            for (int i = 0; i < length; i++) {
                res[i] = intervals.get(i);
            }
            return res;
        }
    }
}

/**
 * Your SummaryRanges object will be instantiated and called as such:
 * SummaryRanges obj = new SummaryRanges();
 * obj.addNum(value);
 * int[][] param_2 = obj.getIntervals();
 */
