/**
 * 1523. Count Odd Numbers in an Interval Range
 * Difficulty : Easy
 */

public class Solution_1523 {
    public int countOdds(int low, int high) {
        return (high + 1) / 2 - low / 2;
    }
}
