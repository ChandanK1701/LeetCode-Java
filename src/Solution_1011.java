/**
 * 1011. Capacity To Ship Packages Within D Days
 * Difficulty : Medium
 */

public class Solution_1011 {
    public int shipWithinDays(int[] weights, int days) {
        int sum = 0;
        int low = 1;
        int high = (weights.length * 500) / days;
        int minPossible = high;
        while(low <= high) {
            int mid = (low + high)/2;
            if(isPossible(weights, mid, days)) {
                minPossible = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return minPossible;
    }

    public boolean isPossible(int[] weights, int capacity, int days) {
        int count = 0;
        int sum = 0;
        for(int i=0; i<weights.length; i++) {
            if(weights[i] > capacity) {
                return false;
            }
            if(sum + weights[i] > capacity) {
                count++;
                sum = 0;
            }
            sum = sum + weights[i];
        }
        count++;
        if(count > days) {
            return false;
        }
        return true;
    }
}
