package arrays;

public class KadaneAlgorithm {

    public static int kadaneAlgorithm(int[] numbers) {

        if(numbers.length == 0) return 0;

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int number : numbers) {
            currSum = currSum + number;
            maxSum = Math.max(currSum, maxSum);

            if (currSum < 0) currSum = 0;


        }

         return maxSum;

    }

    public static void main(String[] args) {
        int[] numbers = {};
        System.out.println(kadaneAlgorithm(numbers));
    }
}
