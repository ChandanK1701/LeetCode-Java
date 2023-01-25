/**
 * 0054. Spiral Matrix
 * Difficulty : Medium
 */

public class Solution_0054 {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> alist = new ArrayList<>();
        int top=0;
        int left=0;
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;

        while(top <= bottom && left <= right) {
            for(int i=left; i<=right; i++) {
                alist.add(matrix[top][i]);
            }
            top++;

            for(int i=top; i<=bottom; i++) {
                alist.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom) {
                for(int i=right; i>=left; i--) {
                    alist.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if(left <= right) {
                for(int i=bottom; i>=top; i--) {
                    alist.add(matrix[i][left]);
                }
                left++;
            }
        }
        return alist;
    }
}
