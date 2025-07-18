package Stack;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(nextGreaterElement(new int[]{6, 8, 0, 12, 13})));

    }

    // tc-O(n)
    public static int[] nextGreaterElement(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) { // for right greater element
//      for (int i = 0; i < nums.length; i++) {  // for left greater element


            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                ans[i] = -1;
            } else {
                ans[i] = stack.peek();
            }
            stack.push(nums[i]);
        }
        return ans;
    }
}
