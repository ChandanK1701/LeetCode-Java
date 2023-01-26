/**
 * 0131. Palindrome Partitioning
 * Difficulty : Medium
 */

public class Solution_0131 {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        dfs(s, 0, new ArrayList<>(), ans);
        return ans;
    }

    static void dfs(String str, int start, List<String> path, List<List<String>> ans) {
        if(start == str.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }
        for(int i=start; i<str.length(); ++i) {
            if(isPalindrome(str, start, i)) {
                path.add(str.substring(start, i+1));
                dfs(str, i+1, path, ans);
                path.remove(path.size()-1);
            }
        }
    }

    static boolean isPalindrome(String str, int left, int right) {
        while(left < right) {
            if(str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
