package ArraysStringSortingBinarySearchPatterns;

public class FindMissingPositiveLeetCode41 {
    public static void main(String[] args) {
     int[] nums = {3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        int i = 0;
        while(i<nums.length){
            int index = nums[i]-1;
            if(nums[i]>0 && nums[i]<=nums.length && nums[i]!=nums[index]){
                swap(nums,i,index);
            }
            else{
                i++;
            }
        }

        for(int iterating = 0; iterating<nums.length; iterating++){
            if(iterating + 1 != nums[iterating]){
                return iterating+1;
            }
        }
        return nums.length+1;
    }

    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
