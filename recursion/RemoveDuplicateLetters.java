package recursion;

public class RemoveDuplicateLetters {

    public static StringBuilder removeDuplicateLetters(String str){
        boolean[] map = new boolean[26];
        StringBuilder newStr = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            int index = str.charAt(i) - 'a';
            if(!map[index]){
                newStr.append(str.charAt(i));
                map[index] = true;
            }
        }

        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("priyanka"));  // Output: priyank
    }
}
