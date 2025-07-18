package arrayList;

import java.util.ArrayList;

public class PairSumOne {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSumOne(list, 50));

    }

    public static boolean pairSumOne(ArrayList<Integer> list, int target) {
        int leftPointer = 0;
        int rightPointer = list.size() - 1;
        while (leftPointer < rightPointer) {
            if (list.get(leftPointer) + list.get(rightPointer) == target) {
                return true;
            } else if (list.get(leftPointer) + list.get(rightPointer) < target) {
                leftPointer++;
            } else {
                rightPointer--;
            }
        }
        return false;


    }
}
