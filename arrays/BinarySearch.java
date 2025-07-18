package arrays;

public class BinarySearch {

    static int binarySearch(int[] numbers , int key){
        int first = 0;
        int last = numbers.length;

        while(first <= last){
            int mid = first + (last-first)/2;

            if(key > numbers[mid]) first = mid + 1;
            else if(key < numbers[mid]) last = mid-1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] numbers = { 1 , 2 , 3 , 4, 5 , 6, 7 , 8, 9 , 10 };
        int key = 9;
        System.out.println(binarySearch(numbers, key));
    }
}
