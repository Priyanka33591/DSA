package arrays;

public class SumOfSubArray {

    static void printSubArray(int[] numbers){

        int totalSubArray = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i ; j < numbers.length; j++) {
                totalSubArray++;
            }
        }
        System.out.println("total number of sub arrays = " + totalSubArray);
    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
