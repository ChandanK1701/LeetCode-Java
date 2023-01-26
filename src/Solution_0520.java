/**
 * 0520. Detect Capital
 * Difficulty : Easy
 */

public class Solution_0520 {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count = 0;
        if(n == 0) {
            return true;
        }
        for(int i=0; i<n; i++) {
            int ch = word.charAt(i);
            if(ch >= 65 && ch <= 90) {
                count++;
            }
        }
        if(count == n || count == 0) {
            return true;
        }
        if(count == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90) {
            return true;
        }
        return false;
    }
}
