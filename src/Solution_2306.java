/**
 * 2306. Naming a Company
 * Difficulty : Hard
 */

public class Solution_2306 {
    public long distinctNames(String[] ideas) {
        long ans = 0;
        Set<String>[] suffix = new HashSet[26];
        for(int i=0; i<26; i++) {
            suffix[i] = new HashSet<>();
        }
        for(String idea : ideas) {
            suffix[idea.charAt(0) - 'a'].add(idea.substring(1));
        }
        for(int i=0; i<26; ++i) {
            for(int j=i+1; j<26; ++j) {
                int count = 0;
                for(String str : suffix[i]) {
                    if(suffix[j].contains(str)) {
                        ++count;
                    }
                }
                ans += 2 * (suffix[i].size() - count) * (suffix[j].size() - count);
            }
        }
        return ans;
    }
}
