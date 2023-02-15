/**
 * 0989. Add to Array-Form of Integer
 * Difficulty : Easy
 */

public class Solution_0989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> alist = new ArrayList<>();
        for(int i=num.length-1; i>=0; i--) {
            alist.add(0, (num[i] + k) % 10);
            k = (num[i] + k) / 10;
        }
        while(k > 0) {
            alist.add(0, k%10);
            k = k / 10;
        }
        return alist;
    }
}
