package Stack;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    //    TC-O(n)
    public static int maxArea(int[] heights) {

        Stack<Integer> stack = new Stack<>();

        int[] leftSmaller = new int[heights.length];
        int[] rightSmaller = new int[heights.length];

        //next smaller right
        for (int i = heights.length - 1; i >= 0; i--) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                rightSmaller[i] = heights.length;
            } else {
                rightSmaller[i] = stack.peek();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            stack.pop();
        }

        //next smaller left
        for (int i = 0; i < heights.length; i++) {

            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                leftSmaller[i] = -1;
            } else {
                leftSmaller[i] = stack.peek();
            }
            stack.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
//            height * width(j-i-1) = rightSmaller[i] - leftSmaller
            int area = heights[i] * (rightSmaller[i] - leftSmaller[i] - 1);
            System.out.println(area);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
