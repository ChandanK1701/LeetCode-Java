/**
 * 0067. Add Binary
 * Difficulty : Easy
 */

public class Solution_0067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int aLength = a.length() - 1;
        int bLength = b.length() - 1;
        while(aLength >= 0 || bLength >=0 || carry == 1) {
            if(aLength >= 0) {
                carry += a.charAt(aLength) - '0';
                aLength--;
            }
            if(bLength >= 0) {
                carry += b.charAt(bLength) - '0';
                bLength--;
            }
            sb.append(carry % 2);
            carry = carry / 2;
        }
        return sb.reverse().toString();
    }
}
