package arrays;

import java.util.Arrays;

public class MergeTwoSortedArray {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {
            int idx1 = 0;
            int idx2 = 0;
            int temp;
            for(int i = 0; i < nums1.length; i++){

                if(nums1[idx1] <= nums2[idx2] && idx1 < m){
                    nums1[i] = nums1[idx1];
                    idx1++;
                }else{
                    nums1[i] = nums2[idx2];
                    idx2++;
                }

            }

        }

    public static void main(String[] args) {

            int[] nums1 = {1,2,3,0,0,0};
            int[] nums2 = {2,5,6};
            merge(nums1 , 3,nums2,3);
        System.out.println(Arrays.toString(nums1));
    }

}
