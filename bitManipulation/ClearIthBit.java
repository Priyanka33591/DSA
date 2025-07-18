package bitManipulation;

import java.util.Scanner;

public class ClearIthBit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        clearIthBit(n , i);

    }

    public static void clearIthBit(int n , int i){
        int bitMask = ~(1 << i);
        System.out.println(n & bitMask);
    }
}
