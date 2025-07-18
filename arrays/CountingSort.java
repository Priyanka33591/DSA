package arrays;

import java.util.Arrays;

public class CountingSort {
    public static void countingSort(int[] array) {
        int n = array.length;
        if (n == 0) return;

        // Find the range (maximum value)
        int max = array[0];
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Create count array
        int[] count = new int[max + 1];

        // Count occurrences of each element
        for (int num : array) {
            count[num]++;
        }

        // Reconstruct the sorted array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                array[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 2, 8, 3, 3, 1};
        System.out.println("Original array: " + Arrays.toString(array));

        countingSort(array);

        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}