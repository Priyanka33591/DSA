package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthChainOfPair {
    public static void main(String[] args) {


        int[][] pairs = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};

        Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < pairs[0].length;j++){
                System.out.print(pairs[i][j] +" ");
            }
            System.out.println();
        }

        int chainLen = 1 ;
        int chainEnd = pairs[0][1];
        for(int i = 1; i < pairs.length;i++){
            if(pairs[i][0] > chainEnd){
                chainLen++;
                chainEnd = pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
