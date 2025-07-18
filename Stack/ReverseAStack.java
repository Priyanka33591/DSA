package Stack;

import java.util.Stack;

public class ReverseAStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        reverseStack(stack);
        printStack(stack);

    }

    public static void printStack(Stack<Integer> stack){
        while((!stack.isEmpty())){
            System.out.println(stack.pop());
        }
    }


    public static void reverseStack(Stack<Integer> stack){
        //base case
        if(stack.isEmpty()){
            return;
        }


        //recursive call
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack,top);
    }
    public static void pushAtBottom(Stack<Integer> stack , int data){
        //base case
        if(stack.isEmpty()){
            stack.push(data);
            return;
        }

        //recursive call
        int top = stack.pop();
        pushAtBottom(stack,data);
        stack.push(top);

    }
}
