/**
 * 0472. Concatenated Words
 * Difficulty : Hard
 */

public class Solution_0472 {
    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        List<String> ans = new ArrayList<>();
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        Map<String, Boolean> memo = new HashMap<>();
        for(String word : words) {
            if(wordBreak(word, wordSet, memo)) {
                ans.add(word);
            }
        }
        return ans;
    }

    public boolean wordBreak(String word, Set<String> wordSet, Map<String, Boolean> memo) {
        if(memo.containsKey(word)) {
            return memo.get(word);
        }
        for(int i=1; i<word.length(); i++) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            if(wordSet.contains(prefix) && (wordSet.contains(suffix) || wordBreak(suffix, wordSet, memo))) {
                memo.put(word, true);
                return true;
            }
        }
        memo.put(word, false);
        return false;
    }
}
