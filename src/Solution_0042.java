/**
 * 0042. Trapping Rain Water
 * Difficulty : Hard
 */
public class Solution_0042 {
    public int trap(int[] height) {
        int n = height.length;
        int left[] = new int[n];
        int right[] = new int[n];
        right[0] = height[0];
        left[n-1] = height[n-1];
        int ans = 0;

        for(int i=1; i<n; i++) {
            right[i] = Math.max(height[i], right[i-1]);
        }
        for(int i=n-2; i>=0; i--) {
            left[i] = Math.max(height[i], left[i+1]);
        }
        for(int i=0; i<n; i++) {
            ans+=(Math.min(right[i],left[i])-height[i]);
        }
        return ans;
    }
}
