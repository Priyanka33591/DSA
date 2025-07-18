package bitManipulation;

import java.util.Scanner;

public class ClearLastIthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        System.out.println(clearLastIthBit(n,i));
    }
    public static int clearLastIthBit(int n , int i){

        int  bitMask =   (-1 << i);
        return n & bitMask;
    }
}
