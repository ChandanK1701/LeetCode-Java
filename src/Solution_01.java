/**
 * 01. Two Sum
 * Difficulty : Easy
 */

public class Solution_01 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        int size = nums.length;
        for(int i=0; i<size; i++) {
            if(map.containsKey(target - nums[i])) {
                result[0] = map.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
