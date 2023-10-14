package ArraysStringSortingBinarySearchPatterns;

public class CeilOfTargetInBinarySearch {
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,8,15,78};
        int target =90 ;
        int finalIndex= searchInsert(nums,target);
        System.out.println(finalIndex);
    }
    //return ceil means, target if present in array, then returh that index , or check where target is,
    //if target in left, ceil means smallest number greater than or equal to target;
    //so if there are no elements in array then our loop condition wont satisfy which is start<=end, the
    //reason being end will be first than start, so in that case we want ceil so return start.
    //Time complexity = O(logn)
    //Space Complexity= O(1)
    //Best solution
    //
    public static int searchInsert(int[] nums, int target) {
        int start= 0;
        int end = nums.length-1;
        while(start<=end){
            int middle = start+(end-start)/2;
            if(target>nums[nums.length-1]){
                return -1;
            }
            if(nums[middle]==target){
                return middle;
            }
            if(nums[middle]>target){
                end=middle-1;
            }
            if(nums[middle]<target){
                start=middle+1;
            }
        }
        return start;
    }
}
