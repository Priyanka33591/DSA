package greedyAlgorithm;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {

        System.out.println(fractionalKnapsack(new int[]{60, 100, 120}, new int[]{10, 20, 30}, 50));
    }

    public static double fractionalKnapsack(int[] value, int[] weight, int capacity) {


        double[][] ratio = new double[value.length][2];
        //0th col => idx , 1st Col => ratio (value/weight)

        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        for (int i = 0; i < ratio.length; i++) {
            for (int j = 0; j < ratio[0].length;j++){
                System.out.print(ratio[i][j] +",    ");
            }
            System.out.println();
        }


        double max = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (capacity >= weight[idx]) { // for full item
                max = max + value[idx];
                capacity = capacity - weight[idx];
            } else { // fractional item
                max = max + (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }
        return max;
    }
}
