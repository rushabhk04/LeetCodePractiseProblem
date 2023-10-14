package ArraysStringSortingBinarySearchPatterns;

public class LeetCode26RemoveDuplicatesFromSortedArrayEasy {
    public static void main(String[] args) {
        int[] array = new int[]{0,0,1,1,1,2,2,3,3,4};
        LeetCode26RemoveDuplicatesFromSortedArrayEasy leetCode26RemoveDuplicatesFromSortedArrayEasy = new LeetCode26RemoveDuplicatesFromSortedArrayEasy();
        System.out.println(leetCode26RemoveDuplicatesFromSortedArrayEasy.removeDuplicates(array));
    }

    public int removeDuplicates(int[] nums) {
        int j=1;
        for(int i =1; i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

}
