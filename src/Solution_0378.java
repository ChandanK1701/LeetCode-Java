/**
 * 0378. Kth Smallest Element in a Sorted Matrix
 * Difficulty : Medium
 */

public class Solution_0378 {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int m = matrix[0].length;
        int l = 0;

        int arr[] = new int[n*m];
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                arr[l++] = matrix[i][j];
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
