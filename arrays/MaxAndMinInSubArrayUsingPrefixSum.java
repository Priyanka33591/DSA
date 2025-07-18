package arrays;

public class MaxAndMinInSubArrayUsingPrefixSum {

    static void maxAndMinInSubArrayUsingPrefixSum(int[] nums){

        int[] preArr = PrefixArray.prefixArray(nums);

        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

              int currSum = (i == 0) ? preArr[j] : preArr[j] - preArr[i-1];

                if(currSum > maxSum) maxSum = currSum;
                if(currSum < minSum)  minSum = currSum;

            }
        }
        System.out.println("max sum =" + maxSum);
        System.out.println("min sum =" + minSum);
    }

    public static void main(String[] args) {





        int[] numbers = {2, 4, 6, 8, 10};
        maxAndMinInSubArrayUsingPrefixSum(numbers);

    }

}
