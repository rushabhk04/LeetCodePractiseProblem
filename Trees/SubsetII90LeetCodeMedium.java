package Trees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetII90LeetCodeMedium {
    public static void main(String[] args) {
        SubsetII90LeetCodeMedium subsetII90LeetCodeMedium = new SubsetII90LeetCodeMedium();
        int[] nums = new int[]{1,2,2};
        System.out.println(subsetII90LeetCodeMedium.subsetsWithDup(nums));

    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),nums,0);
        return res;
    }

    public void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, int pos) {
        res.add(new ArrayList<>(ls));
        for(int i=pos;i<nums.length;i++) {
            if(i>pos&&nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            helper(res,ls,nums,i+1);
            ls.remove(ls.size()-1);
        }
    }
}
