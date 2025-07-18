package recursion;

public class CalPower {

    public static int calPow(int x , int n){
        if(n == 0){
            return 1 ;
        }

        return x*calPow(x,n-1);
    }
    public static void main(String[] args) {
        System.out.println(calPow(2, -2));
    }
}
