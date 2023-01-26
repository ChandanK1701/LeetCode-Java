/**
 * 0491. Non-decreasing Subsequences
 * Difficulty : Medium
 */

public class Solution_0491 {
    Set<List<Integer>> res;

    public List<List<Integer>> findSubsequences(int[] nums) {
        res = new HashSet<>();
        findSequence(nums, new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }

    public void findSequence(int[] nums, List<Integer> list, int index) {
        if(list.size() >= 2) {
            res.add(new ArrayList<>(list));
        }
        for(int i=index; i<nums.length; i++) {
            if(list.size() == 0 || list.get(list.size()-1) <= nums[i]) {
                list.add(nums[i]);
                findSequence(nums, list, i+1);
                list.remove(list.size()-1);
            }
        }
    }
}
