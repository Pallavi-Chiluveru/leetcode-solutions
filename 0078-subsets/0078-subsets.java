import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        int i = 0;

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> clist = new ArrayList<>();

        printSubset(nums, clist, ans, i);

        return ans;
    }

    public void printSubset(int[] nums,List<Integer> clist,List<List<Integer>> ans,int i) {
        if (i == nums.length) {
        ans.add(new ArrayList<>(clist));
        return;
        }
        
        clist.add(nums[i]);
        printSubset(nums, clist, ans, i + 1);
        
        clist.remove(clist.size() - 1);
        printSubset(nums, clist, ans, i + 1);
    }
}