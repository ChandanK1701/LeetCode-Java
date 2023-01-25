/**
 * 0014. Longest Common Prefix
 * Difficulty : Easy
 */

public class Solution_0014 {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        if(strs.length == 1) {
            return strs[0];
        }
        String res = strs[0];
        for(int i=1; i<strs.length; i++) {
            while(res.length() > 0 && !strs[i].startsWith(res)) {
                res = res.substring(0, res.length()-1);
            }
            if(res.length() == 0) {
                return "";
            }
        }
        return res;
    }
}
