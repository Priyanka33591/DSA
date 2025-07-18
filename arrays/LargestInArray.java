package arrays;

public class LargestInArray {

    static int largestInArray(int[] array){

        int largest = Integer.MIN_VALUE;
        for (int number : array) {
            if(number > largest){
                largest = number;
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        int[] array = { 3, 5 , 7, 4 ,9, 10 , 1 , 6 };
        System.out.println(largestInArray(array));
    }
}
