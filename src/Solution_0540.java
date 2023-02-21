/**
 * 0540. Single Element in a Sorted Array
 * Difficulty : Medium
 */

public class Solution_0540 {
    public int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length-1;
        while(low < high) {
            int mid = (low + high)/2;
            if(mid % 2 == 1) {
                mid--;
            }
            if(nums[mid] != nums[mid+1]) {
                high = mid;
            }
            else {
                low = mid + 2;
            }
        }
        return nums[low];
    }
}
