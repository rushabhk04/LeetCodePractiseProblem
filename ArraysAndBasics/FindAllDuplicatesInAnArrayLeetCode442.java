import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInAnArrayLeetCode442 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int index= nums[i]-1;
            if(nums[index] != nums[i]){
                swap(nums,i,index);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> finalResult = new ArrayList<>();
        for(int iterating = 0; iterating<nums.length; iterating++){
            if(nums[iterating]!=iterating+1){
                finalResult.add(nums[iterating]);
            }
        }
        return finalResult;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
//Runtime complexity
//import java.util.AbstractList;
//class Solution {
//    private List<Integer> res;
//    public List<Integer> findDuplicates(int[] nums) {
//        return new AbstractList<Integer>() {
//            public Integer get(int index) {
//                init();
//                return res.get(index);
//            }
//            public int size() {
//                init();
//                return res.size();
//            }
//            private void init() {
//                if(res != null) return;
//                res = new ArrayList<>();
//                int t;
//                for(int i=0; i<nums.length; i++) {
//                    t = Math.abs(nums[i]);
//                    if(nums[t-1] < 0) {
//                        res.add(t);
//                    } else {
//                        nums[t-1] *= -1;
//                    }
//                }
//            }
//        };
//    }
//}