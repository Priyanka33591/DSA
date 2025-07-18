package bitManipulation;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(oddEven(n));
    }
    public static boolean oddEven(int n){
        return ((n & 1) == 0);
    }
}
