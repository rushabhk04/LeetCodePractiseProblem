import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInTheArrayLeetCode448 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> listOfNumbers = findDisappearedNumbers(nums);
        System.out.println(listOfNumbers);

    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        int i = 0;
        while(i<nums.length){
            int index = nums[i] -1;
            if(nums[i] != nums[index]){
                swap(nums,i,index);
            }
            else{
                i++;
            }
        }
        List<Integer> finalResult = new ArrayList<>();
        for(int j = 0; j <nums.length; j++){
            if(nums[j]!= j+1){
                finalResult.add(j+1);
            }
        }
        return finalResult;
    }

    private static void swap(int[] nums, int i, int index) {
        int temp = nums[i];
        nums[i] = nums[index];
        nums[index] = temp;
    }
}

//Time complexity
//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        return new MyList(nums);
//    }
//
//    private static class MyList extends ArrayList<Integer> {
//        int[] nums;
//
//        public MyList(int[] nums) {
//            this.nums = nums;
//        }
//
//        public int size() {
//            if (nums != null) {
//                method();
//            }
//            return super.size();
//        }
//
//        public void method() {
//            int[] nums = this.nums;
//            Set<Integer> set = new HashSet<>(nums.length + 3, 3f);
//
//            for (int num : nums) {
//                set.add(num);
//            }
//
//            for (int i = nums.length; i > 0; i--) {
//
//                if (!set.contains(i)) {
//                    super.add(i);
//                }
//            }
//
//            this.nums = null;
//        }
//    }
//}

//Space complexity
//class Solution {
//    public List<Integer> findDisappearedNumbers(int[] nums) {
//        ArrayList<Integer> ans = new ArrayList<>();
//        for(int i=0;i<nums.length;i++){
//            int index = Math.abs(nums[i]) -1;
//            if(nums[index]>=0){
//                nums[index] = -nums[index];
//            }
//        }
//        for(int i=0;i<nums.length;i++) {
//            if(nums[i]>=0){
//                ans.add(i+1);
//            }
//        }
//        return ans;
//    }
//