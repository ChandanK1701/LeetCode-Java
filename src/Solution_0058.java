/**
 * 0058. Length of Last Word
 * Difficulty : Easy
 */

public class Solution_0058 {
    public int lengthOfLastWord(String s) {
        int count = 0;
        s = s.trim();
        for(int i=s.length()-1; i>=0; i--) {
            if(s.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}
