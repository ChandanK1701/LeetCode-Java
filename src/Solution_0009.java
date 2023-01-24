/**
 * 09. Palindrome Number
 * Difficulty : Easy
 */

public class Solution_0009 {
    public boolean isPalindrome(int x) {
        int sum = 0;
        int temp = x;
        while(x > 0) {
            int rem = x % 10;
            sum = (sum * 10) + rem;
            x = x / 10;
        }
        if(sum == temp) {
            return true;
        }
        else {
            return false;
        }
    }
}