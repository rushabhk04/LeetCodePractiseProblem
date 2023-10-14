package ArraysStringSortingBinarySearchPatterns;

public class SearchInRotatedArrayLeetCode33 {
    public static void main(String[] args) {
        int[] nums = {5,1,3};
        int target = 5;
        int pivot = search(nums, target);
        System.out.println(pivot);
    }

    public static int search(int[] arrays, int targetToBeReached) {
        int pivotToBeFound = findPivot(arrays, targetToBeReached);
        if (pivotToBeFound == -1) {
            return binarySearch(arrays, targetToBeReached, 0, arrays.length - 1);
        }
        if (arrays[pivotToBeFound] == targetToBeReached) {
            return pivotToBeFound;
        }
        if (targetToBeReached >= arrays[0]) {
            return binarySearch(arrays, targetToBeReached, 0, pivotToBeFound - 1);
        }
        return binarySearch(arrays, targetToBeReached, pivotToBeFound + 1, arrays.length - 1);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }

    //find pivot without duplicates
    public static int findPivot(int[] nums, int target) {
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
