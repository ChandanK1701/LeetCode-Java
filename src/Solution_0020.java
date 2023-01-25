/**
 * 0020. Valid Parentheses
 * Difficulty : Easy
 */

public class Solution_0020 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char it : s.toCharArray()) {
            if (it == '(' || it == '[' || it == '{') {
                stack.push(it);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char ch = stack.pop();
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
