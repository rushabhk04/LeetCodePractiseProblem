package ArraysStringSortingBinarySearchPatterns;

public class LeetCode1512NoOfGoodPairsEasy {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }

    public static int numIdenticalPairs(int[] nums) {
        int count =0;
        for(int i = 0; i< nums.length; i++){
            for(int j =0 ; j<nums.length; j++){
                if(nums[i]==nums[j] && i<j){
                    count+=1;
                }
            }
        }
        return count;
    }

    //public int numIdenticalPairs(int[] nums) {
    //        int count = 0;
    //        Map<Integer, Integer> map = new HashMap<>();
    //        for (int num: nums) {
    //            map.put(num, map.getOrDefault(num, 0) + 1);
    //            count += map.get(num) - 1;
    //        }
    //        return count;
    //    }

    //public int numIdenticalPairs(int[] nums) {int c=0;
    //        for(int i=0;i<nums.length;i++){
    //            for(int j=i+1;j<nums.length;j++){
    //                if(nums[i]==nums[j]){
    //                    c++;
    //                }
    //            }
    //        }
    //        return c;
    //    }


}
