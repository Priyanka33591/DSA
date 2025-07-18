package recursion;

public class NthFibonacci {

    public static int nthFibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }


        int fibN = nthFibonacci(n - 1) + nthFibonacci(n - 2);
        return fibN;
    }

    public static void main(String[] args) {
        System.out.println(nthFibonacci(6));
    }
}
