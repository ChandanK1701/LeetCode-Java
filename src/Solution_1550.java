/**
 * 1550. Three Consecutive Odds
 * Difficulty : Easy
 */

public class Solution_1550 {
    public boolean threeConsecutiveOdds(int[] arr) {
        for(int i=0; i<arr.length-2; i++) {
            if(arr[i] % 2 == 1 && arr[i+1] % 2 == 1 && arr[i+2] % 2 == 1) {
                // if(arr[i+1] % 2 == 1) {
                // if(arr[i+2] % 2 == 1) {
                return true;
                // }
                // }
            }
        }
        return false;
    }
}
