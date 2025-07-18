package backtracking;

import java.util.Arrays;

public class BacktrackingOnArrays {

    public static void changeArr(int[] arr, int i, int val){
//        base case
        if(i == arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }
//        recursion
        arr[i] = val;
        changeArr(arr,i+1,val+1); //function call step
        arr[i] = arr[i]-2; //backtracking step


    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArr(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
}
