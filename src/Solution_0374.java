/**
 * 0374. Guess Number Higher or Lower
 * Difficulty : Easy
 */

/**************************************************/

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution_0374 {
    public int guessNumber(int n) {
        long firstNum = 1;
        while (firstNum <= n)
        {
            int num = (int)((n + firstNum) / 2);
            int guessNum = guess(num);
            if (guessNum == 0) {
                return num;
            }
            else if (guessNum < 0) {
                n = num - 1;
            }
            else {
                firstNum = num + 1;
            }
        }
        return -1;
    }
}
