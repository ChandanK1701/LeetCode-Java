/**
 * 03.  Longest Substring Without Repeating Characters
 * Difficulty : Medium
 */

public class Solution_03 {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int n = s.length();
        int len = 0;
        while(right < n) {
            if(map.containsKey(s.charAt(right))) {
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }
            map.put(s.charAt(right), right);
            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;
    }
}

