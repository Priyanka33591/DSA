package bitManipulation;

import java.util.Scanner;

public class SetithBit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        setIthBit(n , i);

    }
    public static void setIthBit(int n , int i){
        int bitMask = 1 << i;
        System.out.println(n|bitMask);
    }
}
