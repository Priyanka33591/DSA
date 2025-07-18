package arrays;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] nums){

        for (int i = 1; i < nums.length; i++) {
            int currElement = nums[i];
            int prev = i - 1;

               while(prev >=0 && nums[prev] > currElement){
                   nums[prev + 1] = nums[prev];
                   prev--;
               }
               nums[prev + 1 ] = currElement;
            }
    }

    public static void main(String[] args) {
        int[] nums = {5, 4, 1, 3, 2};
        System.out.println(Arrays.toString(nums));
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));

    }


}
