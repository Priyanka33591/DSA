package arrays;

import java.util.Arrays;

public class BubbleSort {

    //increasing order
    static void bubbleSortInAscendingOrder(int[] array){

        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j =  0; j < array.length -1 - i; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    //decreasing order
    static void bubbleSortInDescendingOrder(int[] array){

        for (int i = 0; i < array.length - 1 ; i++) {
            for (int j =  0; j < array.length -1 - i; j++) {
                if(array[j] < array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {5 , 4 , 1 , 3 , 2};
        bubbleSortInAscendingOrder(nums);
        System.out.println(Arrays.toString(nums));
        bubbleSortInDescendingOrder(nums);
        System.out.println(Arrays.toString(nums));
    }

}
