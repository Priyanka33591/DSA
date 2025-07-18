package arrays;

public class ShellSort {

    // Method to perform Shell Sort
    public static void shellSort(int[] array) {
        int n = array.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform gapped insertion sort
            for (int i = gap; i < n; i++) {
                int temp = array[i];

                // Shift elements to the right to make space for the element at i
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                // Place the temp element at its correct position
                array[j] = temp;
            }
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main method to test the code
    public static void main(String[] args) {
        int[] array = {12, 34, 54, 2, 3, 17, 45};

        System.out.println("Original array:");
        printArray(array);

        shellSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }
}