/**
 * 0169. Majority Eleement
 * Difficulty : Easy
 */

public class Solution_0169 {
    public int majorityElement(int[] nums) {
        int count = 0;
        int element = 0;
        for(int i : nums) {
            if(count == 0) {
                element = i;
            }
            if(i == element) {
                count = count + 1;
            }
            else {
                count = count - 1;
            }
        }
        return element;
    }
}
