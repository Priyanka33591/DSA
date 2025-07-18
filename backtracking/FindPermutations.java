package backtracking;
import java.util.ArrayList;
import java.util.List;

public class FindPermutations {
    public static void main(String[] args) {
        System.out.print("[");
        findPermutation("abc", "");
        System.out.println("]");
        System.out.println(permute(new int[]{1, 2, 3}));
    }

    public static void findPermutation(String str, String ans) {
//        base case
        
        if (str.isEmpty()) {
            System.out.print(" [" + ans + "] ");
            return;
        }

//        recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newStr, ans + curr);
        }
    }


    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        findPermutation(mainList, new ArrayList<>(), nums);
        return mainList;
    }

    public static void findPermutation(List<List<Integer>> mainList, List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            mainList.add(new ArrayList<>(list));
             return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])) {
                continue;
            } else {
                list.add(nums[i]);
                findPermutation(mainList, list, nums);
                list.removeLast();
            }
        }
    }

}
