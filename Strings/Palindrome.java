package Strings;

public class Palindrome {

    public static boolean palindrome(String str){
        String str2 = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            str2 = str2 + str.charAt(i);
        }
        System.out.println(str2);
        return str.equals(str2);
    }
    public static void main(String[] args) {
        System.out.println(palindrome("priyanka"));
    }
}
