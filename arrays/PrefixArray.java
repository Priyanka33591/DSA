package arrays;

import java.util.Arrays;

public class PrefixArray {

    static int[] prefixArray(int[] numbers){

        int[] preArray = new int[numbers.length];
        preArray[0] = numbers[0];
        for(int index = 1; index < numbers.length; index++) {
            preArray[index] = preArray[index-1] + numbers[index];
        }
        return preArray;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(prefixArray(numbers)));

    }
}
