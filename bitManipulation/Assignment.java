package bitManipulation;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //Question - 1
        System.out.println(n ^ n);

        //Question - 2
        swapVariables(10, 20);

        //Question - 3
        System.out.println(-~n);


        //Question 4
        upperCaseToLowerCase();
    }

    public static void swapVariables(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swap: a = " + a + " and b = " + b);
    }

    public static void upperCaseToLowerCase(){
        for(char ch = 'A' ; ch <= 'Z' ; ch++){
            System.out.print((char) (ch | ' '));
        }
    }

}
