/**
 * 0509. Fibonacci Number
 * Difficulty : Easy
 */

public class Solution_0509 {
    public int fib(int n) {
        if(n <= 1) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
