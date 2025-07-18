package bitManipulation;

import java.util.Scanner;

public class GetithBit {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = scan.nextInt();
        System.out.println(getithBit(n , i));
    }
    public static int getithBit(int n , int i){
        if(((1 << i) & n) == 0 ){
            return 0;
        }
        return 1;
    }
}
