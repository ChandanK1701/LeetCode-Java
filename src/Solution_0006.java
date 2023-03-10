/**
 * 0006. Zigzag Conversion
 * Difficulty : Medium
 */

public class Solution_0006 {
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        List<StringBuilder> rows = new ArrayList<>();
        for(int i=0; i<Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }
        int curRow = 0;
        boolean down = false;
        for(char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows-1) {
                down = !down;
            }
            curRow += down ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for(StringBuilder row : rows) {
            result.append(row);
        }
        return result.toString();
    }
}
