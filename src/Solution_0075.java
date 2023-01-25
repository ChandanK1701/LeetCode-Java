/**
 * 0075. Sort Colors
 * Difficulty : Medium
 */

public class Solution_0075 {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high) {
            switch(nums[mid]) {
                case 0: {
                    swap(nums, low, mid);
                    low++;
                    mid++;
                    break;
                }
                case 1: {
                    mid++;
                    break;
                }
                case 2: {
                    swap(nums, mid, high);
                    high--;
                    break;
                }
            }
        }
    }

    public static void swap(int arr[], int low, int high) {
        int temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}
