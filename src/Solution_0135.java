/**
 * 0135. Candy
 * Difficulty : Hard
 */

public class Solution_0135 {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int left[] = new int[n];
        int right[] = new int[n];
        // int ans = 0;
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for(int i=1; i<n; i++) {
            if(ratings[i] > ratings[i-1]) {
                left[i] = left[i-1] + 1;
            }
        }

        for(int i=n-2; i>=0; i--) {
            if(ratings[i] > ratings[i+1]) {
                right[i] = right[i+1] + 1;
            }
        }

        int totalCandies = 0;
        for(int i=0; i<n; i++) {
            // totalCandies += candies[i];
            totalCandies += Math.max(left[i], right[i]);
        }
        return totalCandies;
    }
}
