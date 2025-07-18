package Stack;

import java.util.Stack;

public class ReverseAString {
    public static void main(String[] args) {
       String str = "priya";
        System.out.println(str);
        System.out.println(reverseString(str));

    }
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < str.length();i++){
            s.push(str.charAt(i));
        }

        StringBuilder result = new StringBuilder();
        while(!s.isEmpty()){
            char top = s.pop();
            result.append(top);
        }
        return result.toString();
    }

}
