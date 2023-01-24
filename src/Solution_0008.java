/**
 * 08. String to Integer (atoi)
 * Difficulty : Medium
 */

public class Solution_0008 {
    public int myAtoi(String s) {
        if(s == null) {
            return 0;
        }
        s = s.trim();
        if(s.length() == 0) {
            return 0;
        }
        int sign = +1;
        long res = 0;
        if(s.charAt(0) == '-') {
            sign = -1;
        }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;

        while(i < s.length()) {
            if(s.charAt(i) == ' ' || !Character.isDigit(s.charAt(i))) {
                break;
            }
            res = res * 10 + s.charAt(i) - '0';
            if(sign == -1 && -1*res < min) {
                return min;
            }
            if(sign == 1 && res > max) {
                return max;
            }
            i++;
        }
        return (int)(sign*res);
    }
}

