/**
 * 1071. Greatest Common Divisor of Strings
 * Difficulty : Easy
 */

public class Solution_1071 {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }
        if(!str1.startsWith(str2)) {
            return "";
        }
        if(str2.isEmpty()) {
            return str1;
        }
        return gcdOfStrings(str2, mod(str1, str2));
    }

    String mod(String s1, String s2) {
        while(s1.startsWith(s2)) {
            s1 = s1.substring(s2.length());
        }
        return s1;
    }
}
