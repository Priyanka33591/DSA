package arrays;

import java.util.Arrays;

public class ReverseAnArray {

    static void reverserAnArray(int[] array){
        int first = 0;
        int last = array.length - 1;
        while(first < last){
            int temp = array[last];
            array[last] = array[first];
            array[first] = temp;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {

        int[] number = {1 , 2 , 3 , 4 , 5 , 6 , 7 , 8, 9};
        reverserAnArray(number);
        System.out.println(Arrays.toString(number));
    }
}
