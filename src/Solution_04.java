/**
 * 04. Median of Two Sorted Arrays
 * Difficulty : Hard
 */

public class Solution_04 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nums3Size = nums1.length + nums2.length;
        int nums3[] = new int[nums3Size];
        System.arraycopy(nums1, 0, nums3, 0, nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        Arrays.sort(nums3);
        if(nums3Size % 2 != 0) {
            return (double)nums3[(nums3Size-1)/2];
        }
        else {
            double med = (double)(nums3[(nums3Size/2)-1] + nums3[nums3Size/2])/2;
            return med;
        }
    }
}

