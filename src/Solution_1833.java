/**
 * 1833. Maximum Ice Cream Bars
 * Difficulty : Medium
 */

public class Solution_1833 {
    public int maxIceCream(int[] costs, int coins) {
        int sum = 0;
        int count = 0;
        Arrays.sort(costs);
        for(int i=0; i<costs.length; i++) {
            sum = sum + costs[i];
            count++;
            if(sum == coins) {
                return count;
            }
            if(sum > coins) {
                return count-1;
            }
        }
        return count;
    }
}
