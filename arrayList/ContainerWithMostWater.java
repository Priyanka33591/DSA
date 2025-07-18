package arrayList;

import java.util.ArrayList;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(storeWater(height));
    }

    //Bruteforce Approach 0(n^2)
    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = Integer.MIN_VALUE;

        for (int i = 0; i < height.size(); i++) {
            for (int j = i + 1; j < height.size(); j++) {
//                containWater = height* width
                int containWater = (Math.min(height.get(i), height.get(j))) * (j - i);
                maxWater = Math.max(maxWater, containWater);
            }
        }
        return maxWater;
    }
}
