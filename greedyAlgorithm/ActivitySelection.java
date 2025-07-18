package greedyAlgorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 8, 5};
        int[] end = {2, 4, 6, 7, 9, 9};
        System.out.println(activitySelection(start, end));

        int[] start1 = {5, 5, 3, 1, 8, 0};
        int[] end2 = {9, 7, 4, 2, 9, 6};
        System.out.println(activitySelection2(start1, end2));
    }

    public static int activitySelection(int[] start, int[] end) {

        int count = 1;
        int idx = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= end[idx]) {
                count++;
                idx = i;
                ans.add(i);
            }
        }
        System.out.println(ans);
        return count;
    }

    public static int activitySelection2(int[] start, int[] end) {

        int[][] act = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            act[i][0] = i;
            act[i][1] = start[i];
            act[i][2] = end[i];
        }

        Arrays.sort(act, Comparator.comparingDouble(o -> o[2]));

        int count = 1;
        int lastIdx = act[0][2];

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(act[0][0]);

        for (int i = 1; i < start.length; i++) {
            if (act[i][1] >= lastIdx) {
                count++;
                lastIdx = act[i][2];
                ans.add(act[i][0]);
            }
        }


        System.out.println(ans);
        return count;
    }
}
