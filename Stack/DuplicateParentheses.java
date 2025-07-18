package Stack;

import java.util.Stack;

public class DuplicateParentheses {
    public static void main(String[] args) {
        System.out.println(isDuplicateParentheses("((a+b)+(c+d))"));
    }
//  Tc- O(N)
    public static boolean isDuplicateParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                int count = 0;
                while (!(stack.peek() == '(')) {
                    stack.pop();
                    count++;
                }

                if (count < 1) {
                    return true;
                }else {
                    stack.pop();
                }
            }
        }
        return false;
    }
}
