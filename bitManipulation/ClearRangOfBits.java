package bitManipulation;

import java.util.Scanner;

public class ClearRangOfBits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        int j = scan.nextInt();
        System.out.println(clearRangeOfBits(n, i, j));

    }

    public static int clearRangeOfBits(int n , int i , int j){

        int a = (-1) << (j+1);
        int b = ~((-1) << i);
        int bitMask = a | b;
        return n & bitMask;

    }
}
