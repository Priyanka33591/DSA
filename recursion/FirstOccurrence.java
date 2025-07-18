package recursion;

public class FirstOccurrence {

    public static int firstOccurrence(int[] arr, int key, int i) {
        if (i == arr.length) {
            return -1;
        }

        if (key == arr[i]) {
            return i;
        }

        return firstOccurrence(arr, key, ++i);

    }

    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(firstOccurrence(arr, 5, 0));
    }
}
