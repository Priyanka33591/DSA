package greedyAlgorithm;

import java.util.Arrays;
import java.util.Collections;

public class ChocolateProblem {

    public static void main(String[] args) {
//      n = 4 , m = 6;
        Integer[] verCost = {2, 1, 3, 1, 4};
        Integer[] horCost = {4, 1, 2};

        Arrays.sort(verCost, Collections.reverseOrder());
        Arrays.sort(horCost, Collections.reverseOrder());

        int horPieces = 1, verPieces = 1;
        int horPointer = 0, verPointer = 0;

        int totalCost = 0;

        while (horPointer < horCost.length && verPointer < verCost.length) {
            if (verCost[verPointer] <= horCost[horPointer]) {
                totalCost = totalCost + (verPieces * horCost[horPointer]);
                horPieces++;
                horPointer++;
            } else {
                totalCost = totalCost + (horPieces * verCost[verPointer]);
                verPieces++;
                verPointer++;
            }
        }

        while (horPointer < horCost.length) {
            totalCost = totalCost + (verPieces * horCost[horPointer]);
            horPieces++;
            horPointer++;
        }


        while (verPointer < verCost.length) {
            totalCost = totalCost + (horPieces * verCost[verPointer]);
            verPieces++;
            verPointer++;
        }
        System.out.println(horPieces*verPieces);
        System.out.println(totalCost);

    }
}
