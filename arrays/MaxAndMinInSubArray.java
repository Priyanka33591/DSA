package arrays;

public class MaxAndMinInSubArray {

    static void printSubArray(int[] numbers){
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i ; j < numbers.length; j++) {

                int currentSum = 0;

                for (int k = i; k <= j ; k++) {
                    currentSum = currentSum + numbers[k];
                }

                if(currentSum > maxSum) maxSum = currentSum;
                if(currentSum < minSum)  minSum = currentSum;

            }
        }

        System.out.println("max sum =" + maxSum);
        System.out.println("min sum =" + minSum);

    }

    public static void main(String[] args) {

        int[] numbers = {2, 4, 6, 8, 10};
        printSubArray(numbers);
    }
}
