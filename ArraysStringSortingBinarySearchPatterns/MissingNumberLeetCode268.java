package ArraysStringSortingBinarySearchPatterns;

public class MissingNumberLeetCode268 {

    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums)
    {
        int i = 0;
        while(i<nums.length){
            int findRealIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[findRealIndex]){
                swap(nums,i,findRealIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length ; j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
    }
    public static void swap(int[] array, int first, int second){
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
