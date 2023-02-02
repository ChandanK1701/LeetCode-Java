/**
 * 0953. Verifying an Alien Dictionary
 * Difficulty : Easy
 */

public class Solution_0953 {
    public boolean isAlienSorted(String[] words, String order) {
        int alien[] = new int[26];
        int n = order.length();

        for(int i=0; i<n; i++) {
            alien[order.charAt(i) - 'a'] = i;
        }
        for(int i=1; i<words.length; i++) {
            if(!compareWords(words[i-1], words[i], alien)) {
                return false;
            }
        }
        return true;
    }

    public boolean compareWords(String word1, String word2, int[] alien) {
        int i = 0;
        while(i < word1.length() && i < word2.length()) {
            if(word1.charAt(i) == word2.charAt(i)) {
                i++;
            }
            else if(alien[word1.charAt(i) - 'a'] < alien[word2.charAt(i) - 'a']) {
                return true;
            }
            else {
                return false;
            }
        }
        if(word1.length() > word2.length()) {
            return false;
        }
        return true;
    }
}
