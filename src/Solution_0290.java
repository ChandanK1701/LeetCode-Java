/**
 * 0290. Word Pattern
 * Difficulty : Easy
 */

public class Solution_0290 {
    public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");
        char patterns[] = pattern.toCharArray();
        Map<Character, String> map = new HashMap();
        if(patterns.length != words.length) {
            return false;
        }
        for(int i=0; i<patterns.length; i++) {
            if(map.containsKey(patterns[i])) {
                if(!map.get(patterns[i]).equals(words[i])) {
                    return false;
                }
            }
            else {
                if(map.containsValue(words[i])) {
                    return false;
                }
                map.put(patterns[i], words[i]);
            }
        }
        return true;
    }
}
