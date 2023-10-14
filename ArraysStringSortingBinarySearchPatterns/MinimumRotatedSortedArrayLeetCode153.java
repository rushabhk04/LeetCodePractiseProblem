package ArraysStringSortingBinarySearchPatterns;

public class MinimumRotatedSortedArrayLeetCode153 {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7};
        int finalResultInt = findMinimum(array);
        System.out.println(finalResultInt);
    }

    private static int findMinimum(int [] nums) {
        int pivot = findPivot(nums);
        if(pivot==-1){
            return nums[0];
        }
        else{
            return nums[pivot+1];
        }
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (middle < end && nums[middle] > nums[middle + 1]) {
                return middle;
            }
            if (middle > start && nums[middle] < nums[middle - 1]) {
                return middle - 1;
            }
            if (nums[start] >= nums[middle]) {
                end = middle - 1;
            }
            else{
                start = middle + 1;
            }
        }
        return -1;
    }

    public static int findPivotWithDuplicates(int[] nums, int start, int end){
        while(start<=end){
            int middle= start+ (end-start)/2;
            if(nums[start]==nums[middle] && nums[middle]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1]){
                    return end;
                }
                end--;

            }
            else if(nums[middle]>nums[start] || nums[start] == nums[middle] && nums[middle]> nums[end]){
                start = middle+1;

            }
            else{
                end = middle-1;
            }
        }
        return -1;
    }

}
