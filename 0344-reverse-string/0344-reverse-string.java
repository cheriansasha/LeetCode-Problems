import java.util.Stack;

class Solution {
    public void reverseString(char[] s) {
        //understand
        //can we use other data structures?
        //account for whitespace?

        //match: stack

        //plan
        //use stack to keep track of every character in s
        //use stack to pop characters back into the array in reverse order

        //implement
        Stack<Character> stack = new Stack<>();
        for(char elem : s) {
            stack.push(elem);
        }
        for(int i = 0; i < s.length; i++) {
            s[i] = stack.pop();
        }
    }
}