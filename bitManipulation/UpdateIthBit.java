package bitManipulation;

import java.util.Scanner;

public class UpdateIthBit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        int newBit = scan.nextInt();
        System.out.println(updateIthbit(n, i, newBit));
        System.out.println(updateIthbit2(n, i, newBit));

    }

    public static int clearIthBit(int n, int i) {

        int bitMask = ~(1 << i);
        return n & bitMask;

    }

    public static int setIthBit(int n, int i) {

        int bitMask = 1 << i;
        return n | bitMask;

    }

    public static int updateIthbit(int n, int i, int newBit) {

        if (newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }

    }

    public static int updateIthbit2(int n, int i, int newBit) {

        n = clearIthBit(n, i);
        int bitMask = newBit << i;
        return n | bitMask;
    }
}
