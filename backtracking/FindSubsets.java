package backtracking;
import java.util.ArrayList;
import java.util.List;

public class FindSubsets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
     }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> mainList = new ArrayList<>();
        ans(nums,0,new ArrayList<>(), mainList);
        return mainList;
    }

    public static void ans(int[] nums, int i, List<Integer> list ,List<List<Integer>> mainList){
        if(i == nums.length){
            mainList.add(new ArrayList<>(list));
            return;
        }
        //yes
        list.add(nums[i]);
         ans(nums,i+1, list, mainList);
        //backtrack
        list.removeLast();
        // noo
        ans(nums,i+1, list,mainList);


    }
}

