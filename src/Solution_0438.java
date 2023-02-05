/**
 * 0438. Find All Anagrams in a String
 * Difficulty : Medium
 */

public class Solution_0438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<=s.length() - p.length(); i++) {
            if(isAnagram(s.substring(i, i+p.length()), p)) {
                res.add(i);
            }
        }
        return res;
    }

    //Check for Anagram
    public boolean isAnagram(String s, String p) {
        int[] ans = new int[26];
        for(int i=0; i<s.length(); i++) {
            ans[s.charAt(i) - 'a']++;
            ans[p.charAt(i) - 'a']--;
        }
        for(int i : ans) {
            if(i != 0) {
                return false;
            }
        }
        return true;
    }
}
