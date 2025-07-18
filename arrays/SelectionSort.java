package arrays;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] array){
        for (int i = 0; i < array.length - 1 ; i++) {
            int minPos = i;
            for (int j = i + 1 ; j < array.length ; j++) {
                if(array[j] < array[minPos]){
                    minPos =j;
                }
            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
    }

    public static void main(String[] args) {

        int[] nums = {5 , 4 , 1 , 14 , 19 , 20 , 50 , 0 , 2  , 2};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));

    }
}
